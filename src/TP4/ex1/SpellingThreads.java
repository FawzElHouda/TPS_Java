package TP4.ex1;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SpellingThreads extends Thread {
    // Déclaration d'un verrou ReentrantLock
    static Lock verrou = new ReentrantLock();

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
        // Acquisition du verrou avant d'accéder à la liste partagée
        verrou.lock();

        // Boucle pour ajouter les caractères de la chaîne à la liste
        for (int i = 0; i < chaine.length(); i++) {
            message.add(chaine.charAt(i));
        }

        // Affichage de la liste
        System.out.println(message);

        // Libération du verrou après avoir terminé l'accès à la liste
        verrou.unlock();
    }
}
