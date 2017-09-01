package eu.wiessenberg;

import eu.wiessenberg.model.BaseNote;
import eu.wiessenberg.model.Interval;
import eu.wiessenberg.model.Note;
import eu.wiessenberg.model.scales.MajorScale;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class KeyFactory {
    public static List<Note> createMajorKey(Note tonic) {
        List<Interval> formula = new MajorScale().getFormula();
        List<Note> notes = new ArrayList<>();

        for (Interval interval: formula) {
            BaseNote baseNote = notes.size() > 0 ? notes.get(notes.size() - 1).getNextBaseNote(): tonic.getBaseNote();
            int position = (((tonic.getPosition()-1) + (interval.getNrOfSemitonesFromRoot()-1)) % 12) + 1;
            Note note = Note.getNote(position, baseNote);
            notes.add(note);
        }

        return notes;
    }

    public static List<List<Note>> createAllMajorKeys() {
        return ApplicationProperties.getInstance().getKeys()
                .stream()
                .map(KeyFactory::createMajorKey)
                .collect(Collectors.toList());
    }

    public static List<Note> getAllUniqueNotesFromAllMajorKeys() {
        return createAllMajorKeys()
                .stream()
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }
}