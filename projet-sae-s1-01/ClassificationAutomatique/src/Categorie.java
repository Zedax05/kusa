import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Categorie {

    private String nom; // le nom de la catégorie p.ex : sport, politique,...
    private ArrayList<PaireChaineEntier> lexique; //le lexique de la catégorie

    // constructeur
    public Categorie(String nom) {
        this.nom = nom;
        this.lexique = new ArrayList<>();
    }


    public String getNom() {
        return nom;
    }


    public  ArrayList<PaireChaineEntier> getLexique() {
        return lexique;
    }


    // initialisation du lexique de la catégorie à partir du contenu d'un fichier texte
    public void initLexique(String nomFichier) {
        try{
            FileInputStream file = new FileInputStream(nomFichier);
            Scanner lecteur = new Scanner(file);


            int index;String ligne;String chaine;int entier;
            do{
                ligne=lecteur.nextLine();
                index = ligne.indexOf(':');
                chaine = ligne.substring(0,index);
                entier = Integer.parseInt(ligne.substring(index+1));
                PaireChaineEntier pair = new PaireChaineEntier(chaine,entier);
                lexique.add(pair);
            }while(lecteur.hasNextLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //calcul du score d'une dépêche pour la catégorie
    public int score(Depeche d) {
        return 0;
    }


}