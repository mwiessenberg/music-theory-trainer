package eu.wiessenberg.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Modes {
    public static final List<Mode> MODES = Collections.unmodifiableList(Arrays.asList(
            new Mode(1, "Ionian"),
            new Mode(2, "Dorian"),
            new Mode(3, "Phrygian"),
            new Mode(4, "Lydian"),
            new Mode(5, "Myxolydian"),
            new Mode(6, "Aeolian"),
            new Mode(7, "Locrian")
    ));
}
