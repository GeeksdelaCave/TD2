package fr.univ_amu.iut;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;


public class TestLecteur {

    /**
     * Test de l'intégrité du fichier avec du contenu "sûr"
     */
    @Test
    public void testIfLecteurReadsConteneurs() {

        Collection<Conteneur> listOfData = new ArrayList<Conteneur>();
        listOfData.add(new Conteneur("Soc1", "Alicante", 110));
        listOfData.add(new Conteneur("Soc3", "Barcelone", 110));
        listOfData.add(new Conteneur("Soc2", "Valence", 90));

        Collection<Conteneur> conteneursDuFichier = Lecteur.charger("monFichier");

        assert (listOfData.containsAll(conteneursDuFichier) && conteneursDuFichier.containsAll(listOfData));



    }
}
