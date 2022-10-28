public class HiloThread extends Thread{

     //Construcutor - Cómo se va a configurar el hilo
    public HiloThread(String name) {
        this.setName(name);
    }
    public HiloThread(String name, int prioridad){
        this.setName(name);
        this.setPriority(prioridad);
    }

    // Ejecución (run) - Trabajo a desarrollar

    @Override
    public void run() {

        System.out.println("Soy un hilo creado como Thread y mi nombre es :" + getName());
    }

    public  void dormir(int tiempo) throws InterruptedException {
        Thread.sleep(1000);
    }
}
