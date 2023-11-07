package exer3;

import java.util.ArrayList;

public class ListeTableau implements ListeGenerique<Integer> {
    @Override
    public void ajouter(Integer a, ArrayList<Integer> tab) {
        tab.add(a);
    }

    @Override
    public Integer get(int i, ArrayList<Integer> tab) {
        return tab.get(i);
    }

    @Override
    public int taille(ArrayList<Integer> a) {
        return a.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> entiers = new ArrayList<Integer>();

        ListeTableau tab = new ListeTableau();
        tab.ajouter(1, entiers);
        tab.ajouter(2, entiers);
        tab.ajouter(3, entiers);
        tab.ajouter(4, entiers);
        tab.ajouter(85, entiers);
        tab.ajouter(11, entiers);
        tab.ajouter(12, entiers);
        System.out.println(tab.get(1, entiers));
        System.out.println(tab.taille(entiers));
        tab.ajouter(6, entiers);
        System.out.println(tab.get(5, entiers));
    }
}
