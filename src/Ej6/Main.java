package Ej6;

public class Main {

    public static void main(String[] args) {

        Contador contador = new Contador();

        Hilo hilo1 = new Hilo(contador);
        Hilo hilo2 = new Hilo(contador);
        Hilo hilo3 = new Hilo(contador);
        Hilo hilo4 = new Hilo(contador);
        Hilo hilo5 = new Hilo(contador);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
            hilo5.join();
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Valor final del contador: " + contador.getValor());
    }
}