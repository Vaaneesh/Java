public class Multithreading extends thread {
    public void run(){
        System.out.println("running....");
    }
    public static void main(String[] args) {
        Multithreading m1= new Multithreading();
        m1.run();
        
    }
}
