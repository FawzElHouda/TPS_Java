package TP1_Java.CompteRendu;

import java.util.ArrayList;
import java.util.List;

// Classe représentant un fournisseur de produits génériques
public class Fournisseur<T> {
    private String nomFou; // Nom du fournisseur
    private int idFou; // Identifiant du fournisseur
    private List<Produit<T>> produitsFournis; // Liste des produits fournis par le fournisseur

    // Constructeur pour initialiser un fournisseur avec un nom et un identifiant
    public Fournisseur(String nomFournisseur, int idFournisseur) {
        this.nomFou = nomFournisseur;
        this.idFou = idFournisseur;
        this.produitsFournis = new ArrayList<>();
    }

    // Méthode pour ajouter un produit à la liste des produits fournis
    public void ajouterProduit(Produit<T> produit) {
        produitsFournis.add(produit);
    }

    // Méthode pour afficher les produits fournis par le fournisseur
    public void afficherProduits() {
        for (Produit<T> produit : produitsFournis) {
            System.out.println("Produit: " + produit.getNom() + ", Référence: " + produit.getRef() + ", Prix: "
                    + produit.getPrix());
        }
    }
}
