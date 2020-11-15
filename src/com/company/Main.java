package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cuadrilatero c=new Cuadrilatero();
        for (int i = 0; i < 10; i++){
            Luchadores t = new Luchadores(c);
            t.setName("Luchador " + i);
            t.start();
        }

    }
}
