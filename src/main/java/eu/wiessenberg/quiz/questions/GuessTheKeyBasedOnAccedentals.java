package eu.wiessenberg.quiz.questions;

import eu.wiessenberg.model.Note;
import eu.wiessenberg.quiz.Answer;
import eu.wiessenberg.quiz.KeyQuestion;
import eu.wiessenberg.util.PrettyPrinter;

import java.util.ArrayList;
import java.util.List;

public class GuessTheKeyBasedOnAccedentals extends KeyQuestion {
    public GuessTheKeyBasedOnAccedentals(List<Note> key) {
        List<Note> accidentals = extractAccidentalsFrom(key);

        String question;
        if (accidentals.size() == 0) {
            question = "What key does not have any accidentals?";
        } else {
            question = "Given the accidentals " + PrettyPrinter.getNotesAsString(accidentals) + ", to what major key they belong?";
        }
        setQuestion(question, new Answer<>(key.get(0).toString(), new Answer.DefaultAnswerInterpreter()));
    }

    private List<Note> extractAccidentalsFrom(List<Note> key) {
        List<Note> accidentals = new ArrayList<>();

        for(Note note: key) {
            if (note.isSharp() || note.isFlat()) {
                accidentals.add(note);
            }
        }

        return accidentals;
    }
}
