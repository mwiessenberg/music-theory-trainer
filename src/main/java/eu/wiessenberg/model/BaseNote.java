package eu.wiessenberg.model;

public enum BaseNote {
    C, D, E, F, G, A, B;

    static {
        C.previousNote = B;
        C.nextNote = D;

        D.previousNote = C;
        D.nextNote = E;

        E.previousNote = D;
        E.nextNote = F;

        F.previousNote = E;
        F.nextNote = G;

        G.previousNote = F;
        G.nextNote = A;

        A.previousNote = G;
        A.nextNote = B;

        B.previousNote = A;
        B.nextNote = C;
    }

    BaseNote previousNote;
    BaseNote nextNote;

    public BaseNote getPreviousNote() {
        return previousNote;
    }

    public BaseNote getNextNote() {
        return nextNote;
    }
}
