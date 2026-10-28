
package EJ2;

public class Hilo extends Thread {

    private int n;

    public Hilo(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int anterior = 1;
        int actual = 1;

        for (int i = 1; i <= n; i++) {

            if (i == 1 || i == 2) {
                System.out.println(anterior);
            } else {
                int siguiente = anterior + actual;
                System.out.println(siguiente);

                anterior = actual;
                actual = siguiente;
            }
        }
    }
}
