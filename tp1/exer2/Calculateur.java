package exer2;

public class Calculateur {
    public static <T> double somme(T[] Tab) {
        double S = 0.0;
        for (T elem : Tab) {
            // Si l'élément est un Integer, ajoute sa valeur à la somme.
            if (elem instanceof Integer)
                return S += (Integer) elem;
            // Si l'élément est un Double, ajoute sa valeur à la somme.
            else if (elem instanceof Double)
                S += (double) elem;
            // Si l'élément est une chaîne de caractères, convertit la chaîne en double et
            // ajoute à la somme.
            else if (elem instanceof String)
                S += Double.parseDouble((String) elem);
        }
        return S;
    }

    public static void main(String[] args) {
        Integer[] entiers = { 1, 2, 3, 4, 5 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        String[] chaines = { "1.1", "2.2", "3.3", "4.4", "5.5" };

        double resultatEntiers = somme(entiers);
        System.out.println("Somme des entiers : " + resultatEntiers);

        double resultatDoubles = somme(doubles);
        System.out.println("Somme des doubles : " + resultatDoubles);

        double resultatChaines = somme(chaines);
        System.out.println("Somme des chaînes converties en double : " + resultatChaines);
    }
}
