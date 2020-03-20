package net.nowtryz.info641.tp1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonnageTest {
    private static final String NOM = "nom", DESC = "desc";
    private Personnage perso;

    @Before public void intit() {
        perso = new Personnage(NOM, DESC);
    }

    @Test public void testGetNom() {
        assertEquals(NOM, perso.getNom());
    }

    @Test public void testGetDescription() {
        assertEquals(DESC, perso.getDescription());
    }

    @Test public void testToString() {
        assertEquals("Personnage{" +
                "nom='" + NOM + '\'' +
                ", description='" + DESC + '\'' +
                '}', perso.toString());
    }

    // TODO test spells
}
