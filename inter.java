public class inter implements GenericInter<String,Integer>{
    public static void main(String[] args) {
        inter a=new inter();
        a.Print1("Hello");
        a.Print2(13);
    }

    @Override
    public void Print1(String a) {
        System.out.println(a);
    }

    @Override
    public void Print2(Integer a) {
        System.out.println(a);
    }
    
}
