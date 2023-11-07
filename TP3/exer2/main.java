package exer2;

public class main {
    public static void main(String[] args) {
        AndroidRunnable androidRunnable = new AndroidRunnable();
        PythonRunnable pythonRunnable = new PythonRunnable();
        Thread t1 = new Thread(androidRunnable);
        Thread t2 = new Thread(pythonRunnable);
        t1.start();
        t2.start();
    }
}