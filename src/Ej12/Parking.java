package Ej12;

public class Parking {

    private int plazasLibres = 3;

    public synchronized void entrar(String nombre) {
        while (plazasLibres == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }

        plazasLibres--;
        System.out.println(nombre + " entra. Plazas libres: " + plazasLibres);
    }

    public synchronized void salir(String nombre) {
        plazasLibres++;
        System.out.println(nombre + " sale. Plazas libres: " + plazasLibres);

        notifyAll();
    }
}