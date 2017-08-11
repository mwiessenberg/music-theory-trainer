package eu.wiessenberg.model;

public enum Interval {
    ROOT(1, "R"),
    MINOR_SECOND(2, "m2"),
    MAJOR_SECOND(3, "M2"),
    MINOR_THIRD(4, "m3"),
    MAJOR_THIRD(5, "M3"),
    PERFECT_FOURTH(6, "P4"),
    TRITONE(7, "TT"), // Augmented 4th, Diminished 5th
    PERFECT_FIFTH(8, "P5"),
    MINOR_SIXTH(9, "m6"),
    MAJOR_SIXTH(10, "M6"),
    MINOR_SEVENTH(11, "m7"),
    MAJOR_SEVENTH(12, "M7");

    private int nrOfSemitonesFromRoot;
    private String shortNotation;

    Interval(int nrOfSemitones, String shortNotation) {
        this.nrOfSemitonesFromRoot = nrOfSemitones;
        this.shortNotation = shortNotation;
    }

    public int getNrOfSemitonesFromRoot() {
        return nrOfSemitonesFromRoot;
    }

    public String getShortNotation() {
        return shortNotation;
    }
}
