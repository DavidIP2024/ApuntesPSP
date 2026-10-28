package EJ3;


public class Hilo extends Thread {

    public Hilo(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteración " + i + " - " + getName());

            try {
                int tiempo = (int) (Math.random() * 1501) + 500;
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
