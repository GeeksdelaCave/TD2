package fr.univ_amu.iut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JeuxDeTests {

    public static void main(String args[]) {
        Conteneur conteneur1 = new Conteneur("Soc1", "Alicante", 110);
        Conteneur conteneur2 = new Conteneur("Soc3", "Barcelone", 110);
        Conteneur conteneur3 = new Conteneur("Soc2", "Valence", 90);

        try {
            /**
             * Ouverture flux fichier
             */
            FileOutputStream fout = new FileOutputStream("monFichier");
            ObjectOutputStream ous = new ObjectOutputStream(fout);

            /**
             * Enregistrement des conteneurs
             */
            ous.writeObject(conteneur1);
            ous.writeObject(conteneur2);
            ous.writeObject(conteneur3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
