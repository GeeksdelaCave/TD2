package fr.univ_amu.iut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;

public class Lecteur {

    /**
     * Lecteur d'objets depuis un fichier
     * @param fichier Le fichier à ouvrir pour receuillir les informations
     * @return Une collection d'objets contenant le contenu du fichier
     */
    public static Collection charger(String fichier) {

        Collection data = new ArrayList();

        try {
            /**
             * Ouverture flux fichier
             */
            FileInputStream fin = new FileInputStream("monFichier");
            ObjectInputStream in = new ObjectInputStream(fin);

            /**
             * Pour chaque contenu restant, le lire en tant qu'objet
             */
            while (fin.available() > 0)
                data.add(in.readObject());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return data;
    }

}
