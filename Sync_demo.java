public class Sync_demo implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread()+"Printing....");
        }
    }

    public static void main(String[] args) {
        Sync_demo m1 = new Sync_demo();
        Thread t1 =new Thread(m1,"A");
        Thread t2 =new Thread(m1,"B");
        t1.start();
        t2.start();
    }
}
