public class inheritanceCLASS_C {
    public static void main(String[] args) {
        /*CASE 1
        inheritanceCLASS_A a=new inheritanceCLASS_A();
        System.out.println(a.d1);
        System.out.println(a.d2);
        a.fun();
        a.fun1();*/

        //CASE 2
        // inheritanceCLASS_A a=new inheritanceCLASS_B();
        // System.out.println(a.d1);
        // System.out.println(((inheritanceCLASS_B)a).d3);
        // a.fun();
        // a.fun1();
        // ((inheritanceCLASS_B)a).fun2();

        //CASE 3 - error bcoz JVM right side mei dekhega and A class mei d3 and d4 nhi h so on..........
        //inheritanceCLASS_B a=new inheritanceCLASS_A();

        //Case 4
        inheritanceCLASS_B b=new inheritanceCLASS_B();
        System.out.println(b.d1);
        System.out.println(b.d3);
        b.fun();
    }
}
