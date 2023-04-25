public class StringDemo {
    public static void main(String[] args) {
        String s="Yo ";
        // System.out.println(s);
        s+="Sup";
        System.out.println(s);
        String a="abc";
        String b="abc";
        String c=new String ("abc");
        System.out.println(a==b); //Double = will compare the address
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(a.length());
    }
}
