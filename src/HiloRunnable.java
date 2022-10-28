public class HiloRunnable implements Runnable{

    private Thread thread;

    public HiloRunnable(String nombre) {
        this.thread = new Thread(this,nombre);
        thread.start();
    }

    public HiloRunnable(String nombre,int prioridad) {
        this.thread = new Thread(this,nombre);
        this.thread.setPriority(prioridad);
    }

    public void join() throws InterruptedException {
        this.thread.join();
    }
     public void despertar(){
        this.thread.interrupt();
     }

    @Override
    public void run() {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Despertado");
        }
        System.out.println("Hijo Runable : " + this.thread.getName());
    }
}
