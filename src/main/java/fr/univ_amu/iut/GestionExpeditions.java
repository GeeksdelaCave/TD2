package fr.univ_amu.iut;

public class GestionExpeditions {

    public static void main(String args[]) {
        for (Conteneur conteneur : Lecteur.charger("monFichier")) {
            System.out.println(conteneur);
        }
    }

}
