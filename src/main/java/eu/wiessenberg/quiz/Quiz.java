package eu.wiessenberg.quiz;

import eu.wiessenberg.util.PrettyPrinter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {
    private List<Question> questions;
    private int score;

    public void generateQuiz(int nrQuestions) {
        questions = new ArrayList<>(nrQuestions);

        PrettyPrinter.print(System.out, PrettyPrinter.ANSI_PURPLE, "Generating questions...");

        questions = QuestionFactory.generateAllQuestions();

        PrettyPrinter.println(System.out, PrettyPrinter.ANSI_GREEN, "done (a total of " + questions.size() + " questions are created)");
        PrettyPrinter.print(System.out, PrettyPrinter.ANSI_PURPLE, "Shuffling...");

        Collections.shuffle(questions);
        questions = nrQuestions < questions.size() ? questions.subList(0, nrQuestions): questions;

        PrettyPrinter.println(System.out, PrettyPrinter.ANSI_GREEN, "done");
        PrettyPrinter.println(System.out, PrettyPrinter.ANSI_GREEN, "Ready to play!\n");

    }

    public void start() {
        PrettyPrinter.println(System.out, PrettyPrinter.ANSI_BLUE, "Starting quiz with " + questions.size() + " questions. Good luck!");

        int currentQuestion = 1;
        for (Question question: questions) {
            PrettyPrinter.print(System.out, PrettyPrinter.ANSI_YELLOW, currentQuestion++ + ". " + question.getQuestion() + " ");
            question.getAnswer().read();
            if (question.getAnswer().isCorrect()) {
                score ++;
                PrettyPrinter.println(System.out, PrettyPrinter.ANSI_GREEN, ":-) Correct!");
            } else {
                PrettyPrinter.println(System.out, PrettyPrinter.ANSI_RED,"No. The correct answer should be: " + question.getAnswer().getExpectedAnswer());
            }
        }

        PrettyPrinter.println(System.out, PrettyPrinter.ANSI_BLUE,"\nEnd of the quiz. Your score: " + PrettyPrinter.ANSI_GREEN + score + "/" + questions.size());
    }
}
