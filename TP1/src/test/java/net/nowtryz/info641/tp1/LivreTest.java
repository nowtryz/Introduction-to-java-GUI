package net.nowtryz.info641.tp1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LivreTest {
    public static final String TITRE = "titre";
    public static final Set<Auteur> AUTEURS = new HashSet<>();
    public static final int ANNEE_PREMIERE_PARUTION = 1999;

    static {
        AUTEURS.add(new Auteur("Zola", "Emile", "Français"));
    }

    private OutputTester catcher;
    private Livre livre;

    public static Livre createTestInstance() {
        return new Livre(TITRE, AUTEURS, ANNEE_PREMIERE_PARUTION);
    }

    @Before public void init() {
        livre = createTestInstance();
        catcher = new OutputTester();
    }

    @Test public void testGetTitre() {
        assertEquals(TITRE, livre.getTitre());
    }

    @Test public void testGetAuteur() {
        assertEquals(AUTEURS, livre.getAuteurs());
    }

    @Test public void testGetParution() {
        assertEquals(ANNEE_PREMIERE_PARUTION, livre.getAnneePremiereParution());
    }

    @Test public void testPersonnage() {
        Personnage perso = new Personnage("a", "b");

        livre.ajoutPersonnage(perso);
        assertTrue(livre.contientPersonnage(perso.getNom()));

        livre.affichePersonnages();
        assertEquals(perso.toString() + System.lineSeparator(), catcher.getOutput());
    }

    @After public void clean() {
        catcher.reset();
    }

    // TODO test ajouterAuteur
}
