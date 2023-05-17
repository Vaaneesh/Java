import java.util.Scanner;
class AvailableTicket{
    int avl;
    int reqJ;
    int reqM;
    public AvailableTicket(int availTicket,int reqJohn,int reqMike){
        this.avl=availTicket;
        this.reqJ=reqJohn;
        this.reqM=reqMike;
    }
    public void run(){

    }
    public synchronized void booking(){
        if(Thread.currentThread().getName()=="John"){
            if(avl>=reqJ){
                System.out.println("John : tickets booked= "+reqJ);
                avl=avl-reqJ;
            }
            else{
                System.out.println("John : tickets not booked");
            }
        }
        else{
            if(avl>=reqM){
                System.out.println("Mike : tickets booked= "+reqM);
                avl=avl-reqM;
            }
            else{
                System.out.println("Mike : tickets not booked");
            }
        }
    }
}
public class TicketBooking implements Runnable {
    static AvailableTicket avltic;
    @Override
    public void run(){
        avltic.booking();
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int availTicket=ob.nextInt();
        int reqJohn=ob.nextInt();
        int reqMike=ob.nextInt();
        // TicketBooking avltic=new TicketBooking();
        avltic=new AvailableTicket(availTicket,reqJohn,reqMike);
        TicketBooking t=new TicketBooking();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        t1.setName("John");
        t2.setName("Mike");
        t1.setPriority(10);
        t1.start();
        t2.start();
        ob.close();
    }
}
