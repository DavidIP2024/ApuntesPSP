package Teoria;

//class Puerta {
//    private boolean abierta = false;
//
//    public synchronized void esperarApertura()
//            throws InterruptedException {
//        while (!abierta) {
//            wait();
//        }
//
//        System.out.println("El visitante entra");
//    }
//
//    public synchronized void abrir() {
//        abierta = true;
//        System.out.println("Puerta abierta");
//        notifyAll();
//    }
//}

//El código no funciona porque el visitante utiliza Thread.sleep() mientras tiene bloqueado el objeto con synchronized.
// Usaría wait() y notifyAll() en lugar de Thread.sleep().