package TP3.ex1_ex2;

// Classe Runnable qui utilise la méthode synchronisée increment de Main pour incrémenter count dans une boucle
public class Concurrency1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++)
            Main.increment();
    }

    public static void main(String[] args) throws InterruptedException {
        // Création d'une instance de la classe Concurrency1
        Concurrency1 concurrency1 = new Concurrency1();

        // Création de deux threads qui exécutent la même instance de Concurrency1
        Thread th1 = new Thread(concurrency1);
        Thread th2 = new Thread(concurrency1);

        // Démarrage des threads
        th1.start();
        th2.start();

        // Attente que les threads se terminent
        th1.join();
        th2.join();

        // Affichage de la valeur finale de la variable count
        System.out.println("Final Count: " + Main.count);
    }
}
