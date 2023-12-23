import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//http://ressources.unit.eu/cours/Cfacile/co/Exercice6.html

public class Algos {
    public static int saisieEntMinMax(Scanner lecteur, int min, int max) {
// { } => { résultat = un entier de l'intervalle [min..max] saisi par l'utilisateur }

        System.out.println("entrez un entier  dans l'intervalle  [" + min + ":" + max + "]   : ");

        int ent = lecteur.nextInt();

        while (ent < min | ent > max) {
            System.out.println("La valeur invalide , resaisire : dans l'intervalle  [" + min + ":" + max + "]");
            ent = lecteur.nextInt();
        }
        return ent;
    }

    //    Pour l'entier max
//    int x = Integer.MAX_VALUE;
//    ent = saisieEntMinMax(lecteur,val,x);   <- ent > val
    public static int saisieEntSup(Scanner lecteur, int val) {
// { } => { résultat = un entier supérieur à val, saisi par l'utilisateur }
// L'exception InputMismatchException qui sera déclenchée si l'utilisateur
// saisit autre chose qu'un entier est gérée
        int ent;
        do {
            try {
                System.out.println("entrez un entier supperieur a  " + val + "  :  ");
                ent = lecteur.nextInt();
                lecteur.nextLine(); // pour vider le buffer
                if (ent <= val) {

                    System.out.println("saisie invalide , recommencer ");


                }
            } catch (InputMismatchException e) {
                lecteur.nextLine();
                System.out.println("ce n'est pas un entier, recommencer  ");
                ent = saisieEntSup(lecteur, val);
            }
        } while (ent <= val);
        return ent;
    }

    public static String saisieChaineDeV(Scanner lecteur, ArrayList<String> vString) {
// { vString non vide }
// => { résultat = un élément de vString, saisi par l'utilisateur }

        String resultat;
        int indice;

        do {
            System.out.print("choisire un Element dans " + vString + " : ");
            resultat = lecteur.nextLine();
            indice = vString.indexOf(resultat); // Indice sera egale a -1 si resultat n'est pas dans vString ,
            if (indice == -1) {
                System.out.println("Saisie invalide recommencer !");
            }
        } while (indice == -1);
        return resultat;
    }

    public static int maximum(ArrayList<Integer> vInt) {
// { vInt non vide } => { résultat = plus grand entier dans vInt }
        int i = 1;
        int entSup = vInt.get(0);
        while(i < vInt.size()) {
            if (vInt.get(i)  > entSup) {
                entSup = vInt.get(i) ;
            }
            i++;
        }
        return entSup;
    }

    public static float moyenne(ArrayList<Integer> vInt) throws ExceptionMoyImpossible {
// { } =>
// { * si vInt est vide, l'exception ExceptionMoyImpossible est levée
// avec un message expliquant le problème
// * sinon, la moyenne des éléments de vInt est retournée }
        try {
            
        }









//        int moyenne=0;
//        int somme = 0;
//        int i = 0;
//        if (vInt.size() == 0){
//            System.out.println("Moyenne impossible , vecteur vide");
//        }else {
//            while (i < vInt.size()){
//                somme += vInt.get(i);
//                moyenne = somme / (i+1) ;
//                i++;
//            }
//        }
//        return moyenne;
    }




}