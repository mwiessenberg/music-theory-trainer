package eu.wiessenberg.quiz;

import eu.wiessenberg.KeyFactory;
import eu.wiessenberg.model.Note;
import eu.wiessenberg.quiz.questions.EnterAccidentalsForAGivenMajorKey;
import eu.wiessenberg.quiz.questions.EnterKeysForAGivenNote;
import eu.wiessenberg.quiz.questions.GuessTheAmountOfFlatsGivenAMajorKey;
import eu.wiessenberg.quiz.questions.GuessTheAmountOfSharpsGivenAMajorKey;

import java.util.ArrayList;
import java.util.List;

public class QuestionFactory {
    public static List<Question> generateAllQuestions() {
        List<Question> allQuestions = new ArrayList<>();

        List<List<Note>> allKeys = KeyFactory.createAllMajorKeys();

        for (List<Note> key: allKeys) {
            allQuestions.add(new GuessTheAmountOfFlatsGivenAMajorKey(key));
            allQuestions.add(new GuessTheAmountOfSharpsGivenAMajorKey(key));
            allQuestions.add(new EnterAccidentalsForAGivenMajorKey(key));
        }

        for (Note note: KeyFactory.getAllUniqueNotesFromAllMajorKeys()) {
            allQuestions.add(new EnterKeysForAGivenNote(note));
        }
        return allQuestions;
    }
}
