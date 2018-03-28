package eu.wiessenberg.quiz.questions;

import eu.wiessenberg.model.Mode;
import eu.wiessenberg.quiz.Answer;
import eu.wiessenberg.quiz.KeyQuestion;

import java.util.Arrays;
import java.util.List;

public class GuessTheModeName extends KeyQuestion {
    public GuessTheModeName(Mode mode) {
        Answer<String> answer = new Answer<>(String.valueOf(mode.getName()), new Answer.DefaultAnswerInterpreter());
        setQuestion("What is the name of mode for degree " + mode.getDegree() + " ?", answer);
    }
}
