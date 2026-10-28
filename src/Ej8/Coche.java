package Ej8;

import java.util.concurrent.Semaphore;

public class Coche extends Thread {

    private Semaphore parking;

    public Coche(String nombre, Semaphore parking) {
        super(nombre);
        this.parking = parking;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " espera para entrar.");

            parking.acquire();

            System.out.println(getName() + " entra. Plazas libres: " + parking.availablePermits());

            int tiempo = (int) (Math.random() * 4000) + 1000;
            Thread.sleep(tiempo);

            parking.release();

            System.out.println(getName() + " sale. Plazas libres: " + parking.availablePermits());

        } catch (InterruptedException e) {
            return;
        }
    }
}
