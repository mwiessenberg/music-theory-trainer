package eu.wiessenberg;

import eu.wiessenberg.quiz.Quiz;

public class Main {
    public Main(int nrQuestions) {
        ApplicationProperties properties = ApplicationProperties.getInstance();
        properties.load();
        properties.printTo(System.out);

        Quiz quiz = new Quiz();
        quiz.generateQuiz(nrQuestions);
        quiz.start();
    }

    public static void main(String[] args) {
        String nrOfQuestions = args.length > 0 ? args[0]: null;

        new Main(nrOfQuestions != null ? Integer.valueOf(args[0]): 10);
    }
}
