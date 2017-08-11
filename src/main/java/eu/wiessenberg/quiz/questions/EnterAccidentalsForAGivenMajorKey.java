package eu.wiessenberg.quiz.questions;

import eu.wiessenberg.model.Note;
import eu.wiessenberg.quiz.Answer;
import eu.wiessenberg.quiz.KeyQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnterAccidentalsForAGivenMajorKey extends KeyQuestion {

    public EnterAccidentalsForAGivenMajorKey(List<Note> key) {
        Answer answer = new Answer<>(extractAccidentalsFrom(key), (expectedAnswer, actualAnswer) -> {
            List<Note> answer1 = parseNotesFromInput(actualAnswer);

            Collections.sort(expectedAnswer);
            Collections.sort(answer1);

            return expectedAnswer.equals(answer1);
        });
        setQuestion("Enter the accidentals for " + key.get(0).toString() + " major: ", answer);
    }

    private List<Note> parseNotesFromInput(String actualAnswer) {
        List<Note> notes = new ArrayList<>();

        if (!"".equals(actualAnswer.trim())) {
            String[] rawNotes = actualAnswer.split(" ");
            for (int i = 0; i < rawNotes.length; i++) {
                notes.add(Note.fromString(rawNotes[i].trim()));
            }
        }

        return notes;
    }

    private List<Note> extractAccidentalsFrom(List<Note> key) {
        List<Note> accidentals = new ArrayList<>();

        for(Note note: key) {
            if (note.isFlat() | note.isSharp()) {
                accidentals.add(note);
            }
        }

        return accidentals;
    }
}
