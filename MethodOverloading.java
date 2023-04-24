public class MethodOverloading {
    public static void add(int a,int b){
        System.out.println("fun 1 =>"+(a+b));
    }
    public static void add(double a,double b){
        System.out.println("Fun 2=> "+(a+b));
    }
    public static void add(int a,double b){
        System.out.println("Fun 3=> "+(a+b));
    }
    public static void main(String[] args) {
        add(2,3);
        add(2,5.4);
    }
}
