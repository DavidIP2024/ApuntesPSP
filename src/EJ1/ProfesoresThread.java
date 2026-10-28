package EJ1;

public class ProfesoresThread extends Thread {

    private int nivelCabreo = 0;
    private int limitePaciencia;

    public ProfesoresThread(String nombre, int limitePaciencia) {
        super(nombre);
        this.limitePaciencia = limitePaciencia;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limitePaciencia; i++) {
            nivelCabreo++;

            if (i == limitePaciencia) {
                System.out.println("[" + getName() + "] Cabreo nivel: "
                        + nivelCabreo + "... ¡He llegado a mi límite!");
            } else {
                System.out.println("[" + getName() + "] Cabreo nivel: "
                        + nivelCabreo);
            }
        }
    }
}
