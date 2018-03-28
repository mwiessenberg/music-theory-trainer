package eu.wiessenberg.quiz.questions;

import eu.wiessenberg.model.Mode;
import eu.wiessenberg.model.Note;
import eu.wiessenberg.quiz.Answer;
import eu.wiessenberg.quiz.KeyQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class GuessTheModeDegree extends KeyQuestion {
    public GuessTheModeDegree(Mode mode) {
        Answer<String> answer = new Answer<>(String.valueOf(mode.getDegree()), new Answer.DefaultAnswerInterpreter());
        setQuestion("What is the degree of mode '" + mode.getName() + "' ?", answer);
    }
}
