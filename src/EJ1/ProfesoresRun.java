package EJ1;

public class ProfesoresRun implements Runnable {

    private int nivelCabreo = 0;
    private String nombre;
    private int limitePaciencia;

    public ProfesoresRun(String nombre, int limitePaciencia) {
        this.nombre = nombre;
        this.limitePaciencia = limitePaciencia;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limitePaciencia; i++) {
            nivelCabreo++;

            if (i == limitePaciencia) {
                System.out.println("[" + nombre + "] Cabreo nivel: "
                        + nivelCabreo + "... ¡He llegado a mi límite!");
            } else {
                System.out.println("[" + nombre + "] Cabreo nivel: "
                        + nivelCabreo);
            }
        }
    }
}
