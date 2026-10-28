package Teoria;

//No funciona porque hemos quitado synchronized, que permite tener el bloqueo necesario para usar wait() y notifyAll().
// Al ejecutar el código, se produce un error porque se intenta esperar o avisar sin tener ese bloqueo.
// Para solucionarlo, hay que volver a poner synchronized en los dos métodos.

//public void esperarApertura() throws InterruptedException {
//while (!abierta) {
//wait();
//}
//System.out.println("El visitante entra");
//}
//public void abrir() {
//abierta = true;
//System.out.println("Puerta abierta");
//notifyAll();
//}