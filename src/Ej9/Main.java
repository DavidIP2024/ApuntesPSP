package Ej9;

public class Main {

    public static void main(String[] args) {

        Marcador marcador = new Marcador();

        Torno torno1 = new Torno("Torno-1", marcador);
        Torno torno2 = new Torno("Torno-2", marcador);
        Torno torno3 = new Torno("Torno-3", marcador);
        Torno torno4 = new Torno("Torno-4", marcador);

        torno1.start();
        torno2.start();
        torno3.start();
        torno4.start();

        try {
            torno1.join();
            torno2.join();
            torno3.join();
            torno4.join();
        } catch (InterruptedException e) {
            return;
        }

        int suma = torno1.getEntradas()
                + torno2.getEntradas()
                + torno3.getEntradas()
                + torno4.getEntradas();

        System.out.println("Marcador del estadio: " + marcador.getValor());
        System.out.println("Suma de los tornos: " + suma);
    }
}