package fr.univ_amu.iut;


import java.io.Serializable;

public class Conteneur implements Serializable {
    private String expediteur, destination;
    private int poids;

    /**
     * Constructeur du conteneur
     * @param expediteur La société expéditrice du conteneur
     * @param destination La ville à laquelle le conteneur doit être livré
     * @param poids Le poids arrondi au kilo du conteneur
     */
    public Conteneur(String expediteur, String destination, int poids) {
        this.expediteur = expediteur;
        this.destination = destination;
        this.poids = poids;
    }

    /**
     * Ré-écriture du toString pour afficher le conteneur
     * @return Chaîne à afficher décrivant le conteneur
     */
    @Override
    public String toString() {
        return "Conteneur{" +
                "expediteur='" + expediteur + '\'' +
                ", destination='" + destination + '\'' +
                ", poids=" + poids +
                '}';
    }
}
