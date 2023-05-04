public class Exceptionhandling {
    public static void main(String[] args)throws Exception {
        Exceptionhandling2 a=new Exceptionhandling2();
        // a.age=20;
        // a.name="Vasu";
        // a.intro();
        a.setAge(-2);
        System.out.println(a.getAge());
    }
}