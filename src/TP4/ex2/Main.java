package TP4.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character>message =new ArrayList<>();
        Thread producer =new Producer(message);
        Thread consumer =new Consumer(message);
        producer.start();
        consumer.start();
    }
}
