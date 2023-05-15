public class Multithreading implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        Multithreading m1 = new Multithreading();
        Thread t1 =new Thread(m1);
        Thread t2 =new Thread(m1);

        t1.start();
        t2.start();
    }
}
