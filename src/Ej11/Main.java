package Ej11;

public class Main {

    public static void main(String[] args) {

        Impresora impresora = new Impresora();

        Trabajador trabajador1 = new Trabajador("Preparador", impresora, true);
        Trabajador trabajador2 = new Trabajador("Impresor", impresora, false);

        trabajador2.start();
        trabajador1.start();
    }
}