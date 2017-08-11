package eu.wiessenberg.quiz.questions;

import eu.wiessenberg.model.Note;
import eu.wiessenberg.quiz.Answer;
import eu.wiessenberg.quiz.KeyQuestion;

import java.util.ArrayList;
import java.util.List;

public class GuessTheAmountOfSharpsGivenAMajorKey extends KeyQuestion {

    public GuessTheAmountOfSharpsGivenAMajorKey(List<Note> key) {
        Answer answer = new Answer<>(String.valueOf(extractSharpsFrom(key).size()), new Answer.DefaultAnswerInterpreter());
        setQuestion("How many sharps does " + key.get(0).toString() + " major have?", answer);
    }

    private List<Note> extractSharpsFrom(List<Note> key) {
        List<Note> accidentals = new ArrayList<>();

        for(Note note: key) {
            if (note.isSharp()) {
                accidentals.add(note);
            }
        }

        return accidentals;
    }
}
