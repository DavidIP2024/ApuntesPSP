package Ej10;

public class Main {

    public static void main(String[] args) {

        Hilo corte = new Hilo("Corte");
        Hilo ensamblaje = new Hilo("Ensamblaje");
        Hilo pintura = new Hilo("Pintura");

        corte.start();
        ensamblaje.start();

        try {
            corte.join();
            ensamblaje.join();

            pintura.start();
            pintura.join();

        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Producto terminado.");
    }
}