package fr.univ_amu.iut;

import com.sun.tools.doclets.internal.toolkit.util.TaggedMethodFinder;

/**
 * Created by pyrrha on 23/11/2016.
 */
public class TarifAuPoids implements ITarif {

    public TarifAuPoids() { //prends des args pour l'injection de dépendance

    }

    public double getTarif(Conteneur conteneur) {
        return 0; //retourne n'importe quoi
    }
}
