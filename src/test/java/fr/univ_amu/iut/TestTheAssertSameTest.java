package fr.univ_amu.iut;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TestTheAssertSameTest {

    /**
     * Donc, par copie, ça marche.
     */
    @Test
    public void testTheAssertSameTest1() {
        Chargement chargement1 = new Chargement(Lecteur.charger("monFichier"));
        Chargement chargement2 = chargement1;

        assertSame (chargement1, chargement2);
    }

    /**
     * Mais pourquoi ça ne marche pas ?
     */
    @Test
    public void testTheAssertSameTest2() {
        Chargement chargement1 = new Chargement(Lecteur.charger("monFichier"));
        Chargement chargement2 = new Chargement(Lecteur.charger("monFichier"));

        assertSame(chargement1, chargement2);
    }

    /**
     * Même en testant le contenu identique ???
     */
    @Test
    public void testTheAssertSameTest3() {
        Chargement chargement1 = new Chargement(Lecteur.charger("monFichier"));
        Chargement chargement2 = new Chargement(Lecteur.charger("monFichier"));

        assertSame(chargement1.getCargaison(), chargement2.getCargaison());
    }

    /**
     * Continuons donc avec le test 1 qui marchait. Là, rajouter puis enlever un conteneur passe
     */
    @Test
    public void testTheAssertSameTest4() {
        Chargement chargement1 = new Chargement(Lecteur.charger("monFichier"));
        Chargement chargement2 = chargement1;

        chargement2.embarquer(new Conteneur("IUT Info Aix", "Malaga", 840));
        chargement2.debarquer();

        assertSame(chargement1, chargement2);
    }

    /**
     * Ah mais ça ça marche ?? Alors pourquoi pas les TestChargement ??
     */
    @Test
    public void testTheAssertSameTest5() {
        Chargement chargement1 = new Chargement(Lecteur.charger("monFichier"));
        Chargement chargement2 = chargement1;

        chargement2.debarquer();
        chargement2.embarquer(new Conteneur("Soc3", "Barcelone", 110));

        assertSame(chargement1.getCargaison(), chargement2.getCargaison());
    }

    /**
     * Bon alors là, je ne comprends plus rien...
     */
    @Test
    public void testTheAssertSameTest6() {
        Chargement chargement1 = new Chargement(Lecteur.charger("monFichier"));
        Chargement chargement2 = chargement1;

        chargement2.debarquer();
        chargement2.embarquer(new Conteneur("Soc3", "Barcelone", 110));

        assertSame(chargement1, chargement2);
    }

}
