package Ej6;

public class Hilo extends Thread {

    private Contador contador;

    public Hilo(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            contador.incrementar();
        }
    }
}