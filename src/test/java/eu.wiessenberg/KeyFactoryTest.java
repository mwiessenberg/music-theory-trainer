package eu.wiessenberg;

import eu.wiessenberg.model.Note;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class KeyFactoryTest {
    @Test
    public void createMajorKeyTestC() {
        List<Note> notes = KeyFactory.createMajorKey(Note.C);
        assertTrue(notes.contains(Note.A));
        assertTrue(notes.contains(Note.B));
        assertTrue(notes.contains(Note.C));
        assertTrue(notes.contains(Note.D));
        assertTrue(notes.contains(Note.E));
        assertTrue(notes.contains(Note.F));
        assertTrue(notes.contains(Note.G));
    }

    @Test
    public void createMajorKeyTestG() {
        List<Note> notes = KeyFactory.createMajorKey(Note.G);
        assertTrue(notes.contains(Note.A));
        assertTrue(notes.contains(Note.B));
        assertTrue(notes.contains(Note.C));
        assertTrue(notes.contains(Note.D));
        assertTrue(notes.contains(Note.E));
        assertTrue(notes.contains(Note.F_SHARP));
        assertTrue(notes.contains(Note.G));
    }

    @Test
    public void createMajorKeyTestD() {
        List<Note> notes = KeyFactory.createMajorKey(Note.D);
        assertTrue(notes.contains(Note.A));
        assertTrue(notes.contains(Note.B));
        assertTrue(notes.contains(Note.C_SHARP));
        assertTrue(notes.contains(Note.D));
        assertTrue(notes.contains(Note.E));
        assertTrue(notes.contains(Note.F_SHARP));
        assertTrue(notes.contains(Note.G));
    }

    @Test
    public void createMajorKeyTestA() {
        List<Note> notes = KeyFactory.createMajorKey(Note.A);
        assertTrue(notes.contains(Note.A));
        assertTrue(notes.contains(Note.B));
        assertTrue(notes.contains(Note.C_SHARP));
        assertTrue(notes.contains(Note.D));
        assertTrue(notes.contains(Note.E));
        assertTrue(notes.contains(Note.F_SHARP));
        assertTrue(notes.contains(Note.G_SHARP));
    }

    @Test
    public void createMajorKeyTestE() {
        List<Note> notes = KeyFactory.createMajorKey(Note.E);
        assertTrue(notes.contains(Note.A));
        assertTrue(notes.contains(Note.B));
        assertTrue(notes.contains(Note.C_SHARP));
        assertTrue(notes.contains(Note.D_SHARP));
        assertTrue(notes.contains(Note.E));
        assertTrue(notes.contains(Note.F_SHARP));
        assertTrue(notes.contains(Note.G_SHARP));
    }

    @Test
    public void createMajorKeyTestB() {
        List<Note> notes = KeyFactory.createMajorKey(Note.B);
        assertTrue(notes.contains(Note.A_SHARP));
        assertTrue(notes.contains(Note.B));
        assertTrue(notes.contains(Note.C_SHARP));
        assertTrue(notes.contains(Note.D_SHARP));
        assertTrue(notes.contains(Note.E));
        assertTrue(notes.contains(Note.F_SHARP));
        assertTrue(notes.contains(Note.G_SHARP));
    }

    @Test
    public void createMajorKeyTestFSharp() {
        List<Note> notes = KeyFactory.createMajorKey(Note.F_SHARP);
        assertTrue(notes.contains(Note.A_SHARP));
        assertTrue(notes.contains(Note.B));
        assertTrue(notes.contains(Note.C_SHARP));
        assertTrue(notes.contains(Note.D_SHARP));
        assertTrue(notes.contains(Note.E_SHARP));
        assertTrue(notes.contains(Note.F_SHARP));
        assertTrue(notes.contains(Note.G_SHARP));
    }

    @Test
    public void createMajorKeyTestDFlat() {
        List<Note> notes = KeyFactory.createMajorKey(Note.D_FLAT);
        assertTrue(notes.contains(Note.A_FLAT));
        assertTrue(notes.contains(Note.B_FLAT));
        assertTrue(notes.contains(Note.C));
        assertTrue(notes.contains(Note.D_FLAT));
        assertTrue(notes.contains(Note.E_FLAT));
        assertTrue(notes.contains(Note.F));
        assertTrue(notes.contains(Note.G_FLAT));
    }

    @Test
    public void createMajorKeyTestAFlat() {
        List<Note> notes = KeyFactory.createMajorKey(Note.A_FLAT);
        assertTrue(notes.contains(Note.A_FLAT));
        assertTrue(notes.contains(Note.B_FLAT));
        assertTrue(notes.contains(Note.C));
        assertTrue(notes.contains(Note.D_FLAT));
        assertTrue(notes.contains(Note.E_FLAT));
        assertTrue(notes.contains(Note.F));
        assertTrue(notes.contains(Note.G));
    }

    @Test
    public void createMajorKeyTestEFlat() {
        List<Note> notes = KeyFactory.createMajorKey(Note.E_FLAT);
        assertTrue(notes.contains(Note.A_FLAT));
        assertTrue(notes.contains(Note.B_FLAT));
        assertTrue(notes.contains(Note.C));
        assertTrue(notes.contains(Note.D));
        assertTrue(notes.contains(Note.E_FLAT));
        assertTrue(notes.contains(Note.F));
        assertTrue(notes.contains(Note.G));
    }

    @Test
    public void createMajorKeyTestBFlat() {
        List<Note> notes = KeyFactory.createMajorKey(Note.B_FLAT);
        assertTrue(notes.contains(Note.A));
        assertTrue(notes.contains(Note.B_FLAT));
        assertTrue(notes.contains(Note.C));
        assertTrue(notes.contains(Note.D));
        assertTrue(notes.contains(Note.E_FLAT));
        assertTrue(notes.contains(Note.F));
        assertTrue(notes.contains(Note.G));
    }

    @Test
    public void createMajorKeyTestF() {
        List<Note> notes = KeyFactory.createMajorKey(Note.F);
        assertTrue(notes.contains(Note.A));
        assertTrue(notes.contains(Note.B_FLAT));
        assertTrue(notes.contains(Note.C));
        assertTrue(notes.contains(Note.D));
        assertTrue(notes.contains(Note.E));
        assertTrue(notes.contains(Note.F));
        assertTrue(notes.contains(Note.G));
    }

    @Test
    public void testGetAllUniqueNotesFromAllMajorKeys() {
        ApplicationProperties.getInstance().load();

        List<Note> notes = KeyFactory.getAllUniqueNotesFromAllMajorKeys();

        assertEquals(18, notes.size());
        assertTrue(notes.contains(Note.A));
        assertTrue(notes.contains(Note.A_SHARP));
        assertTrue(notes.contains(Note.A_FLAT));
        assertTrue(notes.contains(Note.B));
        assertTrue(notes.contains(Note.B_FLAT));
        assertTrue(notes.contains(Note.C));
        assertTrue(notes.contains(Note.C_SHARP));
        assertTrue(notes.contains(Note.D));
        assertTrue(notes.contains(Note.D_SHARP));
        assertTrue(notes.contains(Note.D_FLAT));
        assertTrue(notes.contains(Note.E));
        assertTrue(notes.contains(Note.E_SHARP));
        assertTrue(notes.contains(Note.E_FLAT));
        assertTrue(notes.contains(Note.F));
        assertTrue(notes.contains(Note.F_SHARP));
        assertTrue(notes.contains(Note.G));
        assertTrue(notes.contains(Note.G_SHARP));
        assertTrue(notes.contains(Note.G_FLAT));
    }
}
