package TP4.ex1_1;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        // Création d'une liste partagée entre les threads
        List<Character> message = new ArrayList<>();

        // Création de deux threads qui partagent la même liste
        Thread t1 = new SpellingThreads(message, "Hello");
        Thread t2 = new SpellingThreads(message, "World");

        // Démarrage des threads
        t1.start();
        t2.start();
    }
}
