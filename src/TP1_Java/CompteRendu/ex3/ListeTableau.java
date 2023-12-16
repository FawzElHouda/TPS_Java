package TP1_Java.CompteRendu.ex3;

import java.util.ArrayList;

// Implémentation de l'interface ListeGenerique pour les entiers
public class ListeTableau implements ListeGenerique<Integer> {

    // Méthode pour ajouter un entier à la liste
    @Override
    public void ajouter(Integer a, ArrayList<Integer> tab) {
        tab.add(a);
    }

    // Méthode pour récupérer un entier à l'indice i dans la liste
    @Override
    public Integer get(int i, ArrayList<Integer> tab) {
        return tab.get(i);
    }

    // Méthode pour obtenir la taille de la liste
    @Override
    public int taille(ArrayList<Integer> a) {
        return a.size();
    }

    // Méthode principale pour tester la classe ListeTableau
    public static void main(String[] args) {
        // Création d'une liste d'entiers
        ArrayList<Integer> entiers = new ArrayList<Integer>();

        // Création d'une instance de ListeTableau
        ListeTableau tab = new ListeTableau();

        // Ajout d'entiers à la liste
        tab.ajouter(1, entiers);
        tab.ajouter(2, entiers);
        tab.ajouter(3, entiers);
        tab.ajouter(4, entiers);
        tab.ajouter(85, entiers);
        tab.ajouter(11, entiers);
        tab.ajouter(12, entiers);

        // Affichage de l'élément à l'indice 1
        System.out.println(tab.get(1, entiers));

        // Affichage de la taille de la liste
        System.out.println(tab.taille(entiers));

        // Ajout d'un autre entier à la liste
        tab.ajouter(6, entiers);

        // Affichage de l'élément à l'indice 5 (après l'ajout)
        System.out.println(tab.get(5, entiers));
    }
}
