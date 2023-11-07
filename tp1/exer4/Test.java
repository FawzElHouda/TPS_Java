package exer4;

public class Test {
    public static void main(String[] args) {
        Fournisseur<Integer> fournisseur1 = new Fournisseur<>("Fournisseur A", 1);
        Fournisseur<Double> fournisseur2 = new Fournisseur<>("Fournisseur B", 2);

        Produit<Integer> produit1 = new Produit<>("Produit 1", 101, 10);
        Produit<Double> produit2 = new Produit<Double>("Produit 2", 102.2, 15.22);

        fournisseur1.ajouterProduit(produit1);
        fournisseur2.ajouterProduit(produit2);

        System.out.println("Produits du fournisseur 1:");
        fournisseur1.afficherProduits();

        System.out.println("Produits du fournisseur 2:");
        fournisseur2.afficherProduits();
    }
}
