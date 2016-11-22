package fr.univ_amu.iut;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestChargement {

    /**
     * Teste si le débarquement du dernier conteneur (léger) fonctionne
     */
    @Test
    public void testDebarquementDuDernierConteneurAvecUnPetitPoids() {
        Chargement chargement1 = new Chargement(Lecteur.charger("monFichier"));
        Chargement chargement2 = new Chargement(Lecteur.charger("monFichier"));

        chargement2.embarquer(new Conteneur("Test", "Test", 10));
        chargement2.debarquer();

        assertSame (chargement1.getCargaison(), chargement2.getCargaison());
    }

    /**
     * Teste si le débarquement du dernier conteneur (lourd) fonctionne
     */
    @Test
    public void testDebarquementDuDernierConteneurAvecUnPoidsLourd() {
        Chargement chargement1 = new Chargement(Lecteur.charger("monFichier"));
        Chargement chargement2 = new Chargement(Lecteur.charger("monFichier"));

        chargement2.embarquer(new Conteneur("Test", "Test", 100000000));
        chargement2.debarquer();

        assertSame (chargement1.getCargaison(), chargement2.getCargaison());
    }
}
