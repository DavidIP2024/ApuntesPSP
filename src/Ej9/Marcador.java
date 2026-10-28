package Ej9;

public class Marcador {

    private int entradas = 0;

    public synchronized void incrementarMarcador(int cantidad) {
        entradas += cantidad;
    }

    public int getValor() {
        return entradas;
    }
}