package eu.wiessenberg;

import eu.wiessenberg.model.Note;
import eu.wiessenberg.util.PrettyPrinter;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ApplicationProperties {
    private static ApplicationProperties instance;
    private static final String PROPERTYFILE = "app.properties";

    private List<Note> keys;

    private ApplicationProperties() {
        // singleton; use getInstance()
    }

    public static ApplicationProperties getInstance() {
        if (instance == null) {
            instance = new ApplicationProperties();
        }
        return instance;
    }

    public void load() {
        Properties properies = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(PROPERTYFILE);

        try {
            properies.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        keys = readKeysFrom(properies);
    }

    private List<Note> readKeysFrom(Properties properies) {
        keys = new ArrayList<>();

        String rawValue = properies.getProperty("keys");

        if (rawValue != null) {
            String[] seperateKeys = rawValue.split(",");
            for (int i = 0; i < seperateKeys.length; i++) {
                keys.add(Note.fromString(seperateKeys[i].trim()));

            }
        } else {
            throw new RuntimeException("no 'keys' property in " + PROPERTYFILE);
        }

        return keys;
    }

    public List<Note> getKeys() {
        return keys;
    }

    public void printTo(PrintStream stream) {
        PrettyPrinter.println(stream, PrettyPrinter.ANSI_PURPLE, "Using keys: " + PrettyPrinter.getNotesAsString(getKeys()));
    }
}
