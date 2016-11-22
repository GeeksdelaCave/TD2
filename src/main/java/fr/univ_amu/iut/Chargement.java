package fr.univ_amu.iut;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

public class Chargement {

    private Deque<Conteneur> cargaison = new ArrayDeque<Conteneur>();

    public Chargement(Collection<Conteneur> conteneurs) {
        cargaison.addAll(conteneurs);
    }

    /**
     *
     * @param conteneur Le conteneur a ajouter au dessus des autres
     */
    public void embarquer(Conteneur conteneur) {
        cargaison.push(conteneur);
    }

    /**
     * Pop le dernier conteneur placé sur la pile
     */
    public void debarquer() {
        cargaison.pop();
    }

    /**
     * Getter de la cargaison. Est utile pour les tests
     * @return Retourne la cargaison à fin de tests principalement
     */
    public Deque<Conteneur> getCargaison() {
        return cargaison;
    }
}
