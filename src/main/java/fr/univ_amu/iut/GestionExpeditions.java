package fr.univ_amu.iut;

public class GestionExpeditions {

    public static void main(String args[]) {
        System.out.println("******** CHARGEMENT VERS LA TUNISIE ! :D ********");
        for (Conteneur conteneur : Lecteur.charger("monFichier")) {
            System.out.println("Conteneur chargé ! (distance " + conteneur.getDistance() + ") || " + conteneur);
        }
    }

}
