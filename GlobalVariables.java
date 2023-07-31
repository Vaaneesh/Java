public class GlobalVariables {
    static int a=5;
    public static void main(String[] args) {
    //     Scanner ob=new Scanner(System.in);
    //     int a=10;

    //     ob.close();
    System.out.println("Yo sup!!!");
    fun1();
    fun2();
    }
    private static void fun2(){
        System.out.println("This is fun2");
        System.out.println(a);
    }
    private static void fun1(){
        int a=20;
        System.out.println("This is fun1");
        System.out.println(a);
    }
}
