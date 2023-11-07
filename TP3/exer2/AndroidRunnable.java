package exer2;

import java.io.FileWriter;
import java.io.IOException;

public class AndroidRunnable implements Runnable {
    @Override
    public void run() {
        try {
            try (
                    FileWriter fw = new FileWriter("C:/Users/tenzo/Documents/test1.txt", true)) {
                for (int i = 0; i < 4; i++) {
                    fw.write("I love Android\n");
                    fw.flush();
                }

            }
            System.out.println("finish android");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
