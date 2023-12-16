package TP2_1_java.ex2;

import java.io.FileWriter;
import java.io.IOException;

// Classe représentant un thread pour écrire "I love Python" dans un fichier, mesurant le temps d'exécution
public class PythonThread extends Thread {

    @Override
    public void run() {
        try {
            // Mesurer le temps de début
            long startTime = System.currentTimeMillis();

            // Utilisation de try-with-resources pour assurer la fermeture du FileWriter
            try (FileWriter fw = new FileWriter("C:/Users/tenzo/Documents/test2.txt", true)) {
                for (int i = 0; i < 100000; i++) {
                    fw.write("\tI love Python\n");
                    fw.flush();
                }
            }

            // Mesurer le temps de fin
            long endTime = System.currentTimeMillis();
            System.out.println(getName() + " " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
