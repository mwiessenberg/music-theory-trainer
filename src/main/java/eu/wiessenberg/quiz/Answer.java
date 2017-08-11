package eu.wiessenberg.quiz;

import java.util.Scanner;

public class Answer <T> {
    public interface AnswerInterpreter<A> {
        boolean isCorrect(A expectedAnswer, String actualAnswer);
    }

    public static class DefaultAnswerInterpreter implements AnswerInterpreter<String> {
        @Override
        public boolean isCorrect(String expectedAnswer, String actualAnswer) {
            return expectedAnswer.equalsIgnoreCase(actualAnswer);
        }
    }

    private T expectedAnswer;
    private String answer;
    private AnswerInterpreter<T> answerInterpreter;

    public Answer(T expectedAnswer, AnswerInterpreter<T> answerInterpreter) {
        this.expectedAnswer = expectedAnswer;
        this.answerInterpreter = answerInterpreter;

    }

    public void read() {
        Scanner reader = new Scanner(System.in);
        answer = reader.nextLine();
    }

    public boolean isCorrect() {
        return answerInterpreter.isCorrect(expectedAnswer, answer);
    }

    public T getExpectedAnswer() {
        return expectedAnswer;
    }
}
