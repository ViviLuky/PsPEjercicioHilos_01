public class Main {
    public static void main(String[] args) throws InterruptedException {

        HiloRunnable hiloRunnable=new HiloRunnable("hilo 1");

        Thread.sleep(1000);
        hiloRunnable.despertar();

        System.out.println("Terminado Main");


        }

}