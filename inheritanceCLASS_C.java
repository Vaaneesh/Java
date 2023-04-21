public class inheritanceCLASS_C {
    public static void main(String[] args) {
        /*CASE 1
        inheritanceCLASS_A a=new inheritanceCLASS_A();
        System.out.println(a.d1);
        System.out.println(a.d2);
        a.fun();
        a.fun1();*/

        //CASE 2
        inheritanceCLASS_A a=new inheritanceCLASS_B();
        System.out.println(a.d1);
        a.fun();
    }
}
