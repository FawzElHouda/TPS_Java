package TP1_Java.CompteRendu;

// Classe représentant un produit générique
public class Produit<T> {
    private String nom; // Nom du produit
    private T prix; // Prix du produit
    private T ref; // Référence du produit

    // Constructeur pour initialiser un produit avec un nom, un prix et une
    // référence
    public Produit(String nom, T prix, T ref) {
        this.nom = nom;
        this.prix = prix;
        this.ref = ref;
    }

    // Méthodes getter et setter pour le nom, le prix et la référence du produit
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public T getPrix() {
        return prix;
    }

    public void setPrix(T prix) {
        this.prix = prix;
    }

    public T getRef() {
        return ref;
    }

    public void setRef(T ref) {
        this.ref = ref;
    }
}
