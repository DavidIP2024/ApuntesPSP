package Ej10;

public class Hilo extends Thread {

    public Hilo(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - paso " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}