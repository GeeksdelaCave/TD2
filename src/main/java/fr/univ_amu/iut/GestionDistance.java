package fr.univ_amu.iut;

import java.util.*;

public class GestionDistance {

    private static Map<String, Integer> distances = new TreeMap<String, Integer>() {{
        put("Barcelone", 183);
        put("Valence", 337);
        put("Alicante", 339);
        put("Malaga", 599);
    }};

    public static int getDistance(String ville) {

        return distances.get(ville);
    }


}
