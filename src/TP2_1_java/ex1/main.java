package TP2_1_java.ex1;

// Classe principale pour tester les threads Android et Python
public class main {
    public static void main(String[] args) {
        // Création des threads Android et Python
        AndroidThread androidThread = new AndroidThread();
        PythonThread pythonThread = new PythonThread();

        // Démarrage des threads
        androidThread.start();
        pythonThread.start();
    }
}
