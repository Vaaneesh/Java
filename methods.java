public class methods{
    public static void main(String[] args) {
        add(5,6);
        methods m=new methods();
        m.sub(6,7);

    }
    private void sub(int i,int j){
        System.out.println(i-j);
    }
    private static void add(int i,int j){
        System.out.println(i+j);
    }

    static{      //it will execute at first
        System.out.println("Inside Static block");
    }
}
