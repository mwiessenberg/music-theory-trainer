package eu.wiessenberg.quiz;

import eu.wiessenberg.quiz.Answer;

public abstract class Question {
    private String question;
    private Answer answer;

    public void setQuestion(String question, Answer answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public Answer getAnswer() {
        return answer;
    }
}
