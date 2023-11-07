package exer3;

import java.util.ArrayList;

public interface ListeGenerique<T> {

    abstract void ajouter(T a, ArrayList<T> ab);

    abstract T get(int i, ArrayList<T> tab);

    abstract int taille(ArrayList<T> a);
}
