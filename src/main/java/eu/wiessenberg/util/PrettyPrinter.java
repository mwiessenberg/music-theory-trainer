package eu.wiessenberg.util;

import eu.wiessenberg.model.Note;

import java.io.PrintStream;
import java.util.List;

public class PrettyPrinter {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String getNotesAsString(List<Note> notes) {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < notes.size(); i++) {
            builder.append(notes.get(i).toString());
            if (i<(notes.size()-1)) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }

    public static void print(PrintStream stream, String color, String message) {
        stream.print(color + message + ANSI_RESET);
    }

    public static void println(PrintStream stream, String color, String message) {
        stream.println(color + message + ANSI_RESET);
    }
}
