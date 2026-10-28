package Ej12;

public class Main {

    public static void main(String[] args) {

        Parking parking = new Parking();

        Coche coche1 = new Coche("Coche 1", parking);
        Coche coche2 = new Coche("Coche 2", parking);
        Coche coche3 = new Coche("Coche 3", parking);
        Coche coche4 = new Coche("Coche 4", parking);
        Coche coche5 = new Coche("Coche 5", parking);
        Coche coche6 = new Coche("Coche 6", parking);
        Coche coche7 = new Coche("Coche 7", parking);
        Coche coche8 = new Coche("Coche 8", parking);

        coche1.start();
        coche2.start();
        coche3.start();
        coche4.start();
        coche5.start();
        coche6.start();
        coche7.start();
        coche8.start();

        try {
            coche1.join();
            coche2.join();
            coche3.join();
            coche4.join();
            coche5.join();
            coche6.join();
            coche7.join();
            coche8.join();
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Todos los coches han terminado.");
    }
}