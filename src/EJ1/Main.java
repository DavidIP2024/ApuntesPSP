package EJ1;

public class Main {
    public static void main(String[] args) {

        ProfesoresThread profesor1 = new ProfesoresThread("Diego", 4);
        ProfesoresThread profesor2 = new ProfesoresThread("Manuel", 5);

        ProfesoresRun profesor3 = new ProfesoresRun("Damian", 3);
        ProfesoresRun profesor4 = new ProfesoresRun("Araujo", 5);

        Thread hilo1 = new Thread(profesor3);
        Thread hilo2 = new Thread(profesor4);

        profesor1.start();
        profesor2.start();
        hilo1.start();
        hilo2.start();

        System.out.println("Programa principal terminado.");
    }
}
