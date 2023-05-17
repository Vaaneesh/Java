class shop {
    int totalitems=10;
    public synchronized void getItems(int n){
        if(totalitems>=n){
            System.out.println("Order success....");
            totalitems-=n;
        }
        else{
            System.out.println("Order fail........");
        }
    }
}
public class Order extends Thread{
    int n;
    public Order(int n){
        this.n=n;
    }
    static shop p;

    public void run(){
        p.getItems(n);
    }
    public static void main(String[] args) {
        p=new shop();
        Order t1=new Order(7);
        Order t2=new Order(5);
        t1.start();
        t2.start();
    }
}
