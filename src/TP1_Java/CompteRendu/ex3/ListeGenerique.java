package TP1_Java.CompteRendu.ex3;

import java.util.ArrayList;

// Interface générique définissant des opérations sur une liste de type T
public interface ListeGenerique<T> {
    // Méthode pour ajouter un élément de type T à la liste
    abstract void ajouter(T a, ArrayList<T> ab);

    // Méthode pour récupérer l'élément à l'indice i dans la liste
    abstract T get(int i, ArrayList<T> tab);

    // Méthode pour obtenir la taille de la liste
    abstract int taille(ArrayList<T> a);
}
