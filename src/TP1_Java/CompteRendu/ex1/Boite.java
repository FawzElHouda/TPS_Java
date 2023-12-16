package TP1_Java.CompteRendu.ex1;

// La classe Boite est générique et prend un type paramétré T
public class Boite<T> {

    // Attribut privé pour stocker l'objet de type T
    private T objet;

    // Constructeur de la classe Boite qui prend un objet de type T en paramètre
    public Boite(T objet) {
        this.objet = objet;
    }

    // Méthode getter pour récupérer l'objet stocké dans la boîte
    public T getObjet() {
        return objet;
    }

    // Méthode setter pour mettre à jour l'objet stocké dans la boîte
    public void setObjet(T objet) {
        this.objet = objet;
    }

    // Méthode principale pour tester la classe Boite
    public static void main(String[] args) {
        // Création d'une boîte contenant un entier
        Boite<Integer> entier = new Boite<Integer>(42);

        // Création d'une boîte contenant une chaîne de caractères
        Boite<String> chaine = new Boite<String>("Bonjour");

        // Création d'une boîte contenant un nombre réel
        Boite<Double> reel = new Boite<Double>(3.14);

        // Affichage du contenu de chaque boîte
        System.out.println("Valeur entière: " + entier.getObjet());
        System.out.println("Chaîne de caractères: " + chaine.getObjet());
        System.out.println("Valeur réelle: " + reel.getObjet());
    }
}
