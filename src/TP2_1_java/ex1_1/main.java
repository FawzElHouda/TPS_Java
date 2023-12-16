package TP2_1_java.ex1_1;

// Classe principale pour tester les threads avec des Runnables Android et Python
public class main {
    public static void main(String[] args) {
        // Création des instances des tâches Runnable Android et Python
        AndroidRunnable androidRunnable = new AndroidRunnable();
        PythonRunnable pythonRunnable = new PythonRunnable();

        // Création des threads et démarrage
        Thread t1 = new Thread(androidRunnable);
        Thread t2 = new Thread(pythonRunnable);
        t1.start();
        t2.start();
    }
}
