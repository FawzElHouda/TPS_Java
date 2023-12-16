package TP2_1_java.ex1;

import java.io.FileWriter;
import java.io.IOException;

// Classe représentant un thread pour écrire "I love Python" dans un fichier
public class PythonThread extends Thread {

    @Override
    public void run() {
        try {
            // Utilisation de try-with-resources pour assurer la fermeture du FileWriter
            try (FileWriter fw = new FileWriter("C:/Users/tenzo/Documents/test.txt", true)) {
                for (int i = 0; i < 4; i++) {
                    fw.write("I love Python\n");
                    fw.flush();
                }
            }
            System.out.println("Finish Python");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
