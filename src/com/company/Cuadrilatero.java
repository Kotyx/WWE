package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Cuadrilatero extends Thread{
    private static final int MAX_AVAILABLE=2;
    private final Semaphore available = new Semaphore(MAX_AVAILABLE,true);

    public void AddParticipante(Luchadores luchador) throws InterruptedException {
        available.acquire();
    }

    public void Lucha(Luchadores luchador) throws InterruptedException {
        Random r=new Random();
        int ganador=r.nextInt(5000)+1000;
        System.out.println("El luchador "+luchador.getName()+" entra en el cuadrilatero");
        sleep(ganador);
        System.out.println("El luchador"+luchador.getName()+" ha perdido me voy del cuadrilatero");

    }

    public void terminaLucha(Luchadores luchador){
        available.release();
    }
}
