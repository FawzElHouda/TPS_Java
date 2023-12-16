package TP2_java.EX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomProcessBuilder {
    public static void main(String[] args) {
        // Liste des commandes à exécuter
        List<String> commands = new ArrayList<>();
        commands.add("cmd.exe"); // Commande pour le terminal Windows
        commands.add("/c"); // Option pour exécuter la commande et fermer le terminal après
        commands.add("dir"); // Commande "dir" pour lister les fichiers dans le répertoire actuel
        commands.add("/b"); // Option pour afficher uniquement les noms des fichiers

        try {
            // Création d'un objet ProcessBuilder avec la liste de commandes
            ProcessBuilder processBuilder = new ProcessBuilder(commands);

            // Démarrage du processus
            Process p = processBuilder.start();

            // Lecture de la sortie standard du processus
            Scanner s = new Scanner(p.getInputStream());
            System.out.println("Output Stream:");
            while (s.hasNextLine())
                System.out.println(s.nextLine());

            // Lecture de la sortie d'erreur du processus
            System.out.println("Error Stream:");
            Scanner s1 = new Scanner(p.getErrorStream());
            while (s1.hasNextLine())
                System.out.println(s1.nextLine());

            // Attente de la fin du processus
            int exitCode = p.waitFor();
            System.out.println("Exit Code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
