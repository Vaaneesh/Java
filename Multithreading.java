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
        Thread t1 =new Thread(m1,"A");
        Thread t2 =new Thread(m1,"B");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.setPriority(9);
        t2.setPriority(7);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.isAlive());
        t1.start();
        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
    }
}
