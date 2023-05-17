public class Exceptionhandling {
    public static void main(String[] args)throws Exception {
        Exceptionhandling2 a=new Exceptionhandling2();
        // a.age=20;
        // a.name="Vasu";
        // a.intro();
        // try{
        //     a.setAge(-2);

        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }
        a.setAge(-2);
        System.out.println(a.getAge());
    }
}