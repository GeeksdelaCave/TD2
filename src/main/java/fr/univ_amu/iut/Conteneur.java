package fr.univ_amu.iut;

import java.io.Serializable;

public class Conteneur implements Serializable, Comparable<Conteneur> {
    private String expediteur, destination;
    private int poids;
    /**
     * @var IUD de la classe, afin de l'identifier de manière unique. Permet de relire dans le fichier monFichier sans bug
     */
    private static final long serialVersionUID = 3540335500357667800L;

    @Override
    public boolean equals(Object o) {
        /**
         * Teste si l'objet est le même (même adresse mémoire)
         */
        if (this == o) return true;

        /**
         * Teste si l'objet est de la même classe
         */
        if (o == null || getClass() != o.getClass()) return false;


        Conteneur conteneur = (Conteneur) o;

        /**
         * Test du poids
         */
        if (poids != conteneur.poids) return false;

        /**
         * Test de l'expéditeur
         */
        else if (expediteur != conteneur.expediteur) return false;

        /**
         * Test de la destination
         */
        else if (destination != conteneur.destination) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Constructeur du conteneur
     *
     * @param expediteur  La société expéditrice du conteneur
     * @param destination La ville à laquelle le conteneur doit être livré
     * @param poids       Le poids arrondi au kilo du conteneur
     */
    public Conteneur(String expediteur, String destination, int poids) {
        this.expediteur = expediteur;
        this.destination = destination;
        this.poids = poids;
    }

    /**
     * Ré-écriture du toString pour afficher le conteneur
     *
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

    /**
     * Détermine la distance à parcourir pour livrer le conteneur
     *
     * @return Retourne la distance Marseille-destination
     */
    public int getDistance() {
        return GestionDistance.getDistance(destination);
    }

    /**
     * Compare la distance de livraison des conteneurs
     *
     * @param o Le conteneur à comparer
     * @return 1 si le conteneur actuel a la plus grande distance, -1 si c'est o
     */
    public int compareTo(Conteneur o) {
        return getDistance() > o.getDistance() ? 1 : -1;
    }
}