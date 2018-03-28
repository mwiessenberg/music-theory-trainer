package eu.wiessenberg.model;

public final class Mode {
    private final int degree;
    private final String name;

    public Mode(int degree, String name) {
        this.degree = degree;
        this.name = name;
    }

    public int getDegree() {
        return degree;
    }

    public String getName() {
        return name;
    }
}
