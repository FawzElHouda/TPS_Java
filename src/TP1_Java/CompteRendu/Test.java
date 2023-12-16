package TP1_Java.CompteRendu;

// Classe de test pour vérifier le fonctionnement de Fournisseur et Produit
public class Test {
    public static void main(String[] args) {
        // Création de fournisseurs avec des types différents (Integer et Double)
        Fournisseur<Integer> fournisseur1 = new Fournisseur<>("Fournisseur A", 1);
        Fournisseur<Double> fournisseur2 = new Fournisseur<>("Fournisseur B", 2);

        // Création de produits avec des types différents (Integer et Double)
        Produit<Integer> produit1 = new Produit<>("Produit 1", 101, 10);
        Produit<Double> produit2 = new Produit<>("Produit 2", 102.2, 15.22);

        // Ajout de produits aux fournisseurs
        fournisseur1.ajouterProduit(produit1);
        fournisseur2.ajouterProduit(produit2);

        // Affichage des produits pour chaque fournisseur
        System.out.println("Produits du fournisseur 1:");
        fournisseur1.afficherProduits();

        System.out.println("Produits du fournisseur 2:");
        fournisseur2.afficherProduits();
    }
}
