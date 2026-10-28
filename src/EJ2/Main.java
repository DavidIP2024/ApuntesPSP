package EJ2;

public class Main {

    public static void main(String[] args) {

        Hilo hilo = new Hilo(10);

        hilo.start();

        try {
            hilo.join();
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Cálculo terminado.");
    }
}
