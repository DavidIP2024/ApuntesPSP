
package Ej7;

public class Hilo extends Thread {

    private Thread siguiente;

    public Hilo(String nombre, Thread siguiente) {
        super(nombre);
        this.siguiente = siguiente;
    }

    @Override
    public void run() {

        if (siguiente != null) {
            try {
                siguiente.join();
            } catch (InterruptedException e) {
                return;
            }
        }

        for (int i = 1; i <= 8; i++) {
            System.out.println("Hilo: " + getName() + " Iteración: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
