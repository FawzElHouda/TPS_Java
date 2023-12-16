package exRev.ex1;

public class Main {
    public static void main(String[] args) {

        Theatre theatre =new Theatre();

        Persone person1 = new Persone("wajdi",3,theatre);

        Persone person2 =new Persone("mahdi",5,theatre);

        Persone person3 = new Persone("ala",2,theatre);

        Persone person4 = new Persone("sami",2,theatre);

        person1.start();
        person2.start();
        person3.start();
        person4.start();
    }
}
