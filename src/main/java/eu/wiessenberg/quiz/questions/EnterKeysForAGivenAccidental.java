package eu.wiessenberg.quiz.questions;

import eu.wiessenberg.ApplicationProperties;
import eu.wiessenberg.KeyFactory;
import eu.wiessenberg.model.Note;
import eu.wiessenberg.quiz.Answer;
import eu.wiessenberg.quiz.KeyQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnterKeysForAGivenAccidental extends KeyQuestion {

    public EnterKeysForAGivenAccidental(Note note) {
        Answer answer = new Answer<>(findKeysForAccidental(note), (expectedAnswer, actualAnswer) -> {
            List<Note> answer1 = parseNotesFromInput(actualAnswer);

            Collections.sort(expectedAnswer);
            Collections.sort(answer1);

            return expectedAnswer.equals(answer1);
        });
        setQuestion("Which of the keys " + ApplicationProperties.getInstance().getKeys() + " contain the note " + note + " ?", answer);
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

    private List<Note> findKeysForAccidental(Note note) {
        List<List<Note>> keys = KeyFactory.createAllMajorKeys();
        List<Note> keysWithAccidentals = new ArrayList<>();

        for (List<Note> key : keys) {
            if (keyHasNote(key, note)) {
                keysWithAccidentals.add(key.get(0));
            }
        }

        System.out.println("note " + note + " is in key " + keysWithAccidentals);

        return keysWithAccidentals;
    }

    private boolean keyHasNote(List<Note> key, Note note) {
        return key.contains(note);
    }
}
