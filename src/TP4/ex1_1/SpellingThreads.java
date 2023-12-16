package TP4.ex1_1;

import java.util.List;
import java.util.concurrent.Semaphore;

public class SpellingThreads extends Thread {
    // Déclaration d'un sémaphore avec une capacité de 1
    static Semaphore verrou = new Semaphore(1);

    // Liste partagée entre les threads
    List<Character> message;
    String chaine;

    // Constructeur
    public SpellingThreads(List<Character> message, String chaine) {
        this.chaine = chaine;
        this.message = message;
    }

    @Override
    public void run() {
        try {
            // Acquisition du sémaphore avant d'accéder à la liste partagée
            verrou.acquire();

            // Boucle pour ajouter les caractères de la chaîne à la liste
            for (int i = 0; i < chaine.length(); i++) {
                message.add(chaine.charAt(i));
            }

            // Affichage de la liste
            System.out.println(message);

            // Libération du sémaphore après avoir terminé l'accès à la liste
            verrou.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
