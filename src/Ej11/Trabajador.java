package Ej11;

public class Trabajador extends Thread {

    private Impresora impresora;
    private boolean preparar;

    public Trabajador(String nombre, Impresora impresora, boolean preparar) {
        super(nombre);
        this.impresora = impresora;
        this.preparar = preparar;
    }

    @Override
    public void run() {
        if (preparar) {
            impresora.prepararDocumento();
        } else {
            impresora.imprimir();
        }
    }
}