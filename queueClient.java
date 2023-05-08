public class queueClient {
    public static void main(String[] args) throws Exception{
        queue q=new queue();
        q.add(10);
        q.add(20);
        q.display();
        q.remove();
        q.display();
        q.remove();
        q.remove();
        q.display();
    }
}
