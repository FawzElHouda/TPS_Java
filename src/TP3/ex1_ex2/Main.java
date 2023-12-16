package TP3.ex1_ex2;

// Classe principale qui contient la variable count et la méthode synchronisée increment
public class Main {
    // Déclaration d'une variable partagée
    public static int count;

    // Méthode synchronisée pour incrémenter la variable count de manière sécurisée
    static synchronized void increment() {
        count++;
    }
}
