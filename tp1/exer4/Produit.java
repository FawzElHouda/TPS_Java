package exer4;

public class Produit<T> {
    private String nom; // Nom du produit
    private T prix; // Prix du produit (de type générique)
    private T ref; // Référence du produit (de type générique)

    // Constructeur pour initialiser un produit avec un nom, un prix et une
    // référence
    public Produit(String nom, T prix, T ref) {
        this.nom = nom;
        this.prix = prix;
        this.ref = ref;
    }

    // Méthode pour obtenir le nom du produit
    public String getNom() {
        return nom;
    }

    // Méthode pour définir le nom du produit
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode pour obtenir le prix du produit
    public T getPrix() {
        return prix;
    }

    // Méthode pour définir le prix du produit
    public void setPrix(T prix) {
        this.prix = prix;
    }

    // Méthode pour obtenir la référence du produit
    public T getRef() {
        return ref;
    }

    // Méthode pour définir la référence du produit
    public void setRef(T ref) {
        this.ref = ref;
    }
}
