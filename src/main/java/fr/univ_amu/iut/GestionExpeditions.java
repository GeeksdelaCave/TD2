package fr.univ_amu.iut;

import java.util.ArrayList;
import java.util.Collection;

public class GestionExpeditions {

    public static void main(String args[]) {

        Collection<Conteneur> conteneurs = new ArrayList<Conteneur>(Lecteur.charger("monFichier"));
        Chargement chargement = new Chargement(conteneurs);

        System.out.println("******** CHARGEMENT VERS LA TUNISIE ! :D ********");
        displayConteneurs(chargement.getCargaison());


        chargement.embarquer(new Conteneur("IUT Info Aix", "Malaga", 840));
        System.out.println('\n' + "** PREMIER PORT : GUANTANAMO ! :D **");
        displayConteneurs(chargement.getCargaison());


        chargement.debarquer();
    System.out.println('\n' + "** SECOND PORT : MALAGUA ! :D **");
        displayConteneurs(chargement.getCargaison());
    }

    public static void displayConteneurs(Collection<Conteneur> conteneurs) {
        for (Conteneur conteneur : conteneurs)
            System.out.println("Conteneur chargé ! (distance " + conteneur.getDistance() + ") || " + conteneur);
    }
}