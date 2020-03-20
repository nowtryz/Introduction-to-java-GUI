package net.nowtryz.info641.tp1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BibliothèqueTest {

    @Test public void baseTest() {
        Bibliothèque bibliothèque = new Bibliothèque();
        Livre livre0 = LivreTest.createTestInstance();
        Livre livre1 = new Livre("test", "test", 1900);

        bibliothèque.ajoputLivre(livre0);
        assertTrue(bibliothèque.contientLivre(livre0.getTitre()));
        assertFalse(bibliothèque.contientLivre(livre1.getTitre()));

        bibliothèque.ajoputLivre(livre1);
        OutputTester catcher = new OutputTester();
        bibliothèque.afficherLivresAuteur(livre0.getAuteur());
        assertEquals(livre0.toString() + System.lineSeparator(), catcher.getOutput());
        catcher.reset();
    }
}
