package Ej12;

public class Coche extends Thread {

    private Parking parking;

    public Coche(String nombre, Parking parking) {
        super(nombre);
        this.parking = parking;
    }

    @Override
    public void run() {
        parking.entrar(getName());

        try {
            Thread.sleep((int) (Math.random() * 4000) + 1000);
        } catch (InterruptedException e) {
            return;
        }

        parking.salir(getName());
    }
}