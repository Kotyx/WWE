package com.company;

public class Luchadores extends Thread{

    Cuadrilatero cuadrilatero;
    public Luchadores(Cuadrilatero cuadrilatero){this.cuadrilatero=cuadrilatero;}
    @Override
    public void run() {
        try {
            cuadrilatero.AddParticipante(this);
            cuadrilatero.Lucha(this);
            cuadrilatero.terminaLucha(this);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
