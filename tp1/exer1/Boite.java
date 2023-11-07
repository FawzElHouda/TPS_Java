package exer1;

public class Boite<T> {
    private T objet;

    public Boite(T objet) {
        this.objet = objet;
    }

    public T getObjet() {
        return objet;
    }

    public void setObjet(T obj) {
        this.objet = obj;
    }

    public static void main(String[] args) {
        // Création des instances de la classe boîte de type String, Integer et Double
        Boite<String> b1 = new Boite<>("Bonjour Madame");
        Boite<Integer> b2 = new Boite<Integer>(1112);
        Boite<Double> b3 = new Boite<Double>(12.11);

        System.out.println("Chaine de caractére: " + b1.getObjet());
        System.out.println("Valeur entiére: " + b2.getObjet());
        System.out.println("Valeur réelle: " + b3.getObjet());
    }

}
