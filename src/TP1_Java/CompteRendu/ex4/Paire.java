package TP1_Java.CompteRendu.ex4;

// Classe générique Paire avec deux types de données, T et U
public class Paire<T, U> {
    private T premier; // Premier élément de type T
    private U deuxieme; // Deuxième élément de type U

    // Constructeur pour initialiser la paire avec un élément de type T et un
    // élément de type U
    public Paire(T premier, U deuxieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
    }

    // Méthode pour obtenir le premier élément de la paire
    public T getPremier() {
        return premier;
    }

    // Méthode pour obtenir le deuxième élément de la paire
    public U getDeuxieme() {
        return deuxieme;
    }

    // Méthode principale pour tester la classe Paire
    public static void main(String[] args) {
        // Création d'une paire avec un entier et une chaîne de caractères
        Paire<Integer, String> paire1 = new Paire<>(42, "Bonjour");

        // Création d'une paire avec un nombre réel et une autre chaîne de caractères
        Paire<Double, String> paire2 = new Paire<>(3.14, "Au revoir");

        // Affichage des éléments de chaque paire
        System.out.println("Paire 1: " + paire1.getPremier() + ", " + paire1.getDeuxieme());
        System.out.println("Paire 2: " + paire2.getPremier() + ", " + paire2.getDeuxieme());
    }
}
