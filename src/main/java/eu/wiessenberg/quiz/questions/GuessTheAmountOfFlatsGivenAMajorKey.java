package eu.wiessenberg.quiz.questions;

import eu.wiessenberg.model.Note;
import eu.wiessenberg.quiz.Answer;
import eu.wiessenberg.quiz.KeyQuestion;
import eu.wiessenberg.quiz.Question;

import java.util.ArrayList;
import java.util.List;

public class GuessTheAmountOfFlatsGivenAMajorKey extends KeyQuestion {
    private List<Note> key;
    private Question question;

    public GuessTheAmountOfFlatsGivenAMajorKey(List<Note> key) {
        Answer answer = new Answer<>(String.valueOf(extractFlatsFrom(key).size()), new Answer.DefaultAnswerInterpreter());
        setQuestion("How many flats does " + key.get(0).toString() + " major have?", answer);
    }

    private List<Note> extractFlatsFrom(List<Note> key) {
        List<Note> accidentals = new ArrayList<>();

        for(Note note: key) {
            if (note.isFlat()) {
                accidentals.add(note);
            }
        }

        return accidentals;
    }
}
