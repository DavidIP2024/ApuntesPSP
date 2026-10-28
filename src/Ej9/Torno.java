package Ej9;

public class Torno extends Thread {

    private Marcador marcador;
    private int entradas;

    public Torno(String nombre, Marcador marcador) {
        super(nombre);
        this.marcador = marcador;
    }

    @Override
    public void run() {
        entradas = (int) (Math.random() * 501) + 500;

        marcador.incrementarMarcador(entradas);

        System.out.println(getName() + ": " + entradas + " entradas");
    }

    public int getEntradas() {
        return entradas;
    }
}