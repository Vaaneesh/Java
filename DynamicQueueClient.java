public class DynamicQueueClient {
    public static void main(String[] args)throws Exception {
        DynamicQueue d=new DynamicQueue();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);
        d.add(60);
        d.add(70);
        d.add(80);
        d.display();
    }
}
