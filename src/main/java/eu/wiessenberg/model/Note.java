package eu.wiessenberg.model;

public enum Note {
    C(BaseNote.C, 1), B_SHARP(BaseNote.B, 1),
    C_SHARP(BaseNote.C, 2), D_FLAT(BaseNote.D, 2),
    D(BaseNote.D, 3),
    D_SHARP(BaseNote.D, 4), E_FLAT(BaseNote.E, 4),
    E(BaseNote.E, 5), F_FLAT(BaseNote.F, 5),
    E_SHARP(BaseNote.E, 6), F(BaseNote.F, 6),
    F_SHARP(BaseNote.F, 7), G_FLAT(BaseNote.G, 7),
    G(BaseNote.G, 8),
    G_SHARP(BaseNote.G, 9), A_FLAT(BaseNote.A, 9),
    A(BaseNote.A, 10),
    A_SHARP(BaseNote.A, 11), B_FLAT(BaseNote.B, 11),
    B(BaseNote.B, 12), C_FLAT(BaseNote.C, 12);

    private int position;
    private BaseNote baseNote;

    Note(BaseNote baseNote, int position) {
        this.baseNote = baseNote;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public static Note getNote(int position, BaseNote baseNote) {
        for (Note note: values()) {
            if (note.position == position && (baseNote == null || baseNote.equals(note.baseNote))) {
                return note;
            }
        }
        throw new IllegalArgumentException("note with position " + position + " does not exist");
    }

    public boolean isFlat() {
        switch(this) {
            case A_FLAT:
            case B_FLAT:
            case C_FLAT:
            case D_FLAT:
            case E_FLAT:
            case F_FLAT:
            case G_FLAT:
                return true;
        }
        return false;
    }

    public boolean isSharp() {
        switch(this) {
            case A_SHARP:
            case B_SHARP:
            case C_SHARP:
            case D_SHARP:
            case E_SHARP:
            case F_SHARP:
            case G_SHARP:
                return true;
        }
        return false;
    }

    public BaseNote getNextBaseNote() {
        return baseNote.getNextNote();
    }

    public String getBaseName() {
        return baseNote.name();
    }

    public String toString() {
        String baseName = getBaseName();
        String quality = "";

        if (name().contains("_")) {
            quality = name().substring(name().indexOf("_")).equals("_FLAT") ? "b": "#";
        }

        return baseName + quality;
    }

    public BaseNote getBaseNote() {
        return baseNote;
    }

    public static Note fromString(final String noteAsString) {
        switch (noteAsString) {
            case "A": return A;
            case "Ab": return A_FLAT;
            case "A#": return A_SHARP;
            case "B": return B;
            case "Bb": return B_FLAT;
            case "B#": return B_SHARP;
            case "C": return C;
            case "Cb": return C_FLAT;
            case "C#": return C_SHARP;
            case "D": return D;
            case "Db": return D_FLAT;
            case "D#": return D_SHARP;
            case "E": return E;
            case "Eb": return E_FLAT;
            case "E#": return E_SHARP;
            case "F": return F;
            case "Fb": return F_FLAT;
            case "F#": return F_SHARP;
            case "G": return G;
            case "Gb": return G_FLAT;
            case "G#": return G_SHARP;
            default: throw new IllegalArgumentException(noteAsString + " is not a valid note");
        }
    }
}