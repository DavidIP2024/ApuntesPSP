package Ej11;

public class Impresora {

    private boolean documentoListo = false;

    public synchronized void imprimir() {
        while (!documentoListo) {
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }

        System.out.println("Imprimiendo documento");
    }

    public synchronized void prepararDocumento() {
        System.out.println("Documento preparado");
        documentoListo = true;
        notifyAll();
    }
}