package Ej5;

public class Hilo extends Thread {

    public Hilo(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println("Nombre del hilo: " + getName()
                    + ", Iteración: " + i
                    + ", Prioridad: " + getPriority());

            try {
                int tiempo = (int) (Math.random() * 9001) + 1000;
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
