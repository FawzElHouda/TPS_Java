package TP1_Java.CompteRendu.ex2;

// La classe Calculateur contient une méthode générique pour calculer la somme d'un tableau d'éléments de type T
public class Calculateur {

    // Méthode générique pour calculer la somme d'un tableau d'éléments de type T
    public static <T> double somme(T[] tableau) {
        double somme = 0.0;

        // Parcours du tableau et addition des éléments à la somme
        for (T elem : tableau) {
            // Vérification du type de l'élément et conversion appropriée
            if (elem instanceof Integer)
                somme += (Integer) elem;
            else if (elem instanceof Double)
                somme += (Double) elem;
            else if (elem instanceof String) {
                // Conversion de la chaîne en double avant l'addition
                somme += Double.parseDouble((String) elem);
            }
        }

        // Retour de la somme calculée
        return somme;
    }

    // Méthode principale pour tester la classe Calculateur
    public static void main(String[] args) {
        // Création de tableaux d'entiers, de doubles et de chaînes
        Integer[] entiers = { 1, 2, 3, 4, 5 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        String[] chaines = { "1.1", "2.2", "3.3", "4.4", "5.5" };

        // Calcul de la somme pour chaque type de tableau
        double resultatEntiers = somme(entiers);
        System.out.println("Somme des entiers : " + resultatEntiers);

        double resultatDoubles = somme(doubles);
        System.out.println("Somme des doubles : " + resultatDoubles);

        double resultatChaines = somme(chaines);
        System.out.println("Somme des chaînes converties en double : " + resultatChaines);
    }
}
