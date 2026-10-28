package Ej4;

public class Main {
    public static void main(String[] args) {

        Hilo hiloPares = new Hilo("pares");
        Hilo hiloImpares = new Hilo("impares");
        Hilo hiloTerminados = new Hilo("terminados");

        hiloPares.start();
        hiloImpares.start();
        hiloTerminados.start();

        try {
            hiloPares.join();
            hiloImpares.join();
            hiloTerminados.join();
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Suma de pares... " + hiloPares.getResultado());
        System.out.println("Suma de impares... " + hiloImpares.getResultado());
        System.out.println("Suma de terminados en 3 o en 4... " + hiloTerminados.getResultado());
    }
}