package Ej5;

public class Main {

    public static void main(String[] args) {

        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        Hilo hilo3 = new Hilo("Hilo 3");
        Hilo hilo4 = new Hilo("Hilo 4");

        hilo1.setPriority(Thread.MIN_PRIORITY);
        hilo2.setPriority(Thread.NORM_PRIORITY);
        hilo3.setPriority(Thread.NORM_PRIORITY);
        hilo4.setPriority(Thread.MAX_PRIORITY);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Han terminado todos");
    }
}