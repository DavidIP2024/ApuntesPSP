package EJ3;


public class Main {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        Hilo hilo3 = new Hilo("Hilo 3");
        Hilo hilo4 = new Hilo("Hilo 4");

        // Arrancamos los cuatro hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        // Esperamos a que terminen todos
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            return;
        }

        long fin = System.currentTimeMillis();
        double tiempoTotal = (fin - inicio) / 1000.0;

        System.out.println("Han terminado todos");
        System.out.println("Tiempo total: " + tiempoTotal + " segundos");
    }
}
