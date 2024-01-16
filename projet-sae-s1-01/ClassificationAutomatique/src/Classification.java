import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Classification {


    private static ArrayList<Depeche> lectureDepeches(String nomFichier) {
        //creation d'un tableau de dépêches
        ArrayList<Depeche> depeches = new ArrayList<>();
        try {
            // lecture du fichier d'entrée
            FileInputStream file = new FileInputStream(nomFichier);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                String id = ligne.substring(3);
                ligne = scanner.nextLine();
                String date = ligne.substring(3);
                ligne = scanner.nextLine();
                String categorie = ligne.substring(3);
                ligne = scanner.nextLine();
                String lignes = ligne.substring(3);
                while (scanner.hasNextLine() && !ligne.equals("")) {
                    ligne = scanner.nextLine();
                    if (!ligne.equals("")) {
                        lignes = lignes + '\n' + ligne;
                    }
                }
                Depeche uneDepeche = new Depeche(id, date, categorie, lignes);
                depeches.add(uneDepeche);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return depeches;
    }


    public static void classementDepeches(ArrayList<Depeche> depeches, ArrayList<Categorie> categories, String nomFichier) {
    }


    public static ArrayList<PaireChaineEntier> initDico(ArrayList<Depeche> depeches, String categorie) {
        ArrayList<PaireChaineEntier> resultat = new ArrayList<>();
        return resultat;

    }

    public static void calculScores(ArrayList<Depeche> depeches, String categorie, ArrayList<PaireChaineEntier> dictionnaire) {
    }

    public static int poidsPourScore(int score) {
        return 0;
    }

    public static void generationLexique(ArrayList<Depeche> depeches, String categorie, String nomFichier) {

    }

    public static void main(String[] args) {

        //Chargement des dépêches en mémoire
        System.out.println("chargement des dépêches");
        ArrayList<Depeche> depeches = lectureDepeches("./depeches.txt");

//        for (int i = 0; i < depeches.size(); i++) {
//            depeches.get(i).afficher();
//        }

        ArrayList<Categorie> categorie = new ArrayList<>();

        Categorie science = new Categorie("science");
        science.initLexique("./lexique/science.txt");
        categorie.add(science);

        Categorie culture = new Categorie("culture");
        culture.initLexique("./lexique/culture.txt");
        categorie.add(culture);

        Categorie politique = new Categorie("politique");
        politique.initLexique("./lexique/politique.txt");
        categorie.add(politique);

        Categorie economie = new Categorie("economie");
        economie.initLexique("./lexique/economie.txt");
        categorie.add(economie);

        Categorie sport = new Categorie("sport");
        sport.initLexique("./lexique/sport.txt");
        System.out.println(sport.getLexique());
        categorie.add(sport);

        System.out.println("categorie :" + categorie);
        int i =0;
        Depeche depeche1 = depeches.get(1);

        while (i< categorie.size()) {
            categorie.get(i).score(depeche1);
        }

        Scanner lecteur = new Scanner(System.in);
        System.out.println(" enrez une valeur  : ");
        String chaine = lecteur.nextLine();
        System.out.println(UtilitairePaireChaineEntier.entierPourChaine(sport.getLexique(), chaine));


    }


}

