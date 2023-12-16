package TP2_1_java.ex2;

// Classe principale pour tester les threads avec des mesures de temps d'exécution
public class main {
    public static void main(String[] args) {
        // Création des instances de threads Android et Python
        AndroidThread androidThread = new AndroidThread();
        PythonThread pythonThread = new PythonThread();

        // Attribution de noms pour une identification plus claire dans les résultats
        pythonThread.setName("Python Thread");
        androidThread.setName("Android Thread");

        // Démarrage des threads
        androidThread.start();
        pythonThread.start();
    }
}
