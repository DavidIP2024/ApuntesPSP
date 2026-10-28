
package Ej7;

public class Main {

    public static void main(String[] args) {

        Hilo hilo3 = new Hilo("3", null);
        Hilo hilo2 = new Hilo("2", hilo3);
        Hilo hilo1 = new Hilo("1", hilo2);

        hilo1.start();
        hilo2.start();
        hilo3.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Han terminado los tres hilos");
    }
}
