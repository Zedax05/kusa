import java.util.ArrayList;
import java.util.Scanner;

public class UtilitairePaireChaineEntier {


    public static int indicePourChaine(ArrayList<PaireChaineEntier> listePaires, String chaine) {
        return 0;

    }

    public static int entierPourChaine(ArrayList<PaireChaineEntier> listePaires, String chaine) {

        int i = 0;
        while (i < listePaires.size()) {
            if (listePaires.get(i).getChaine().compareTo(chaine) == 0) {
                return listePaires.get(i).getEntier();
            }
            i++;
        }
        return 0;
    }


    public static String chaineMax(ArrayList<PaireChaineEntier> listePaires) {
        int max = 0, i = 0;
        String maxs = null;
        while (i < listePaires.size()) {
            if (listePaires.get(i).getEntier() < max ) {
                maxs = listePaires.get(i).getChaine();
            }
            i++;
        }
        return maxs;

    }


    public static float moyenne(ArrayList<PaireChaineEntier> listePaires) {
        return 0;
    }

}
