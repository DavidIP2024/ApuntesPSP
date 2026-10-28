package Teoria;

//(1) NEW: El hilo d está creado, pero todavía no se ha iniciado porque aún no se ha llamado a d.start().
//
//(2) TIMED_WAITING: El hilo d está esperando durante 2 segundos porque está ejecutando Thread.sleep(2000).
//
//(3) WAITING: El hilo e está esperando a que termine el hilo d, porque está ejecutando otro.join().
//
//(4) TERMINATED TERMINATED: Los dos hilos han terminado. El hilo d ha acabado de ejecutar su metodo run() y el hilo e también ha terminado después de que d finalizase.