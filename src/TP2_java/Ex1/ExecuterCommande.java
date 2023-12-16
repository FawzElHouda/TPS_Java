package TP2_java.Ex1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExecuterCommande {

    // Méthode pour exécuter une commande externe
    void executerCommande(String commande) {
        try {
            // Exécution de la commande
            Process p = Runtime.getRuntime().exec(commande);

            // Attente jusqu'à 5 secondes pour que le processus se termine
            if (!p.waitFor(5, TimeUnit.SECONDS)) {
                // Si le processus ne se termine pas dans les 5 secondes, détruire le processus
                System.out.println("Process not terminated in 5 seconds. Destroying the process.");
                p.destroy();
            }

            // Récupération du code de sortie du processus
            int exitCode = p.exitValue();
            System.out.println("Exit Code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // Création d'une instance de la classe ExecuterCommande
        ExecuterCommande commande = new ExecuterCommande();

        // Exécution de la commande (dans ce cas, ouvrir le Bloc-notes)
        commande.executerCommande("Notepad.exe");
    }
}
