package TP3.ex4;

public class ThreadExample extends Thread {
    // Variable volatile utilisée pour contrôler l'exécution du thread
    volatile boolean finish = true;

    // Méthode pour changer la valeur de finish à false
    boolean isFinish() {
        return finish = false;
    }

    @Override
    public void run() {
        // Boucle d'exécution tant que finish est true
        while (finish == true)
            System.out.println("en cours d'exec");
    }

    public static void main(String[] args) throws InterruptedException {
        // Création d'une instance de la classe ThreadExample
        ThreadExample th1 = new ThreadExample();

        // Démarrage du thread
        th1.start();

        // Pause de 100 millisecondes (il est préférable d'utiliser TimeUnit pour des
        // durées plus lisibles)
        Thread.sleep(100);

        // Appel de la méthode isFinish pour changer la valeur de finish à false
        th1.isFinish();
    }
}
