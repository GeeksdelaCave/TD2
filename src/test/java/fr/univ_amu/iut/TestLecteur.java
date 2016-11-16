package fr.univ_amu.iut;

import org.junit.Test;

import java.util.Collection;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestLecteur {

    /**
     * Test de l'intégrité du fichier avec du contenu "sûr"
     */
    @Test
    public void testIfLecteurReadsConteneurs() {

        Collection<Conteneur> listOfData = new TreeSet<Conteneur>();
        listOfData.add(new Conteneur("Soc1", "Alicante", 110));
        listOfData.add(new Conteneur("Soc3", "Barcelone", 110));
        listOfData.add(new Conteneur("Soc2", "Valence", 90));

        Collection<Conteneur> conteneursDuFichier = Lecteur.charger("monFichier");

        assertSame (listOfData, conteneursDuFichier);
    }
}
