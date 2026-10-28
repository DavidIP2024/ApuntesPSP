package Ej4;

public class Hilo extends Thread {

    private String tipo;
    private int resultado;

    public Hilo(String tipo) {
        this.tipo = tipo;
        this.resultado = 0;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1923; i++) {

            if (tipo.equals("pares") && i % 2 == 0) {
                resultado += i;
            }

            if (tipo.equals("impares") && i % 2 != 0) {
                resultado += i;
            }

            if (tipo.equals("terminados") && (i % 10 == 3 || i % 10 == 4)) {
                resultado += i;
            }
        }
    }

    public int getResultado() {
        return resultado;
    }
}