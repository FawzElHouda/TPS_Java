package TP4.ex2;

import java.util.List;

public class Consumer extends Thread {

    List<Character> message;

    public Consumer(List<Character> message) {
        this.message = message;
    }

    // Méthode pour la consommation d'un élément de la liste
    synchronized void consume() {
        while (message.isEmpty()) {
            try {
                // Attente tant que la liste est vide
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // Consommation de l'élément
        char consumed = message.remove(0);
        System.out.println("Consumed: " + consumed);

        // Notification pour signaler la libération d'un élément
        notify();
    }

    @Override
    public void run() {
        consume();
    }
}
