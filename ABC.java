public class ABC {
    public <T> ABC(T a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        ABC a=new ABC("hello");
        ABC a1=new ABC(13);
    }
}
