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
        System.out.println(a.charAt(0));
        System.out.println(a.compareTo(b)); //returns difference
        System.out.println(a.indexOf('b'));
        System.out.println(a.toUpperCase());
        System.out.println(a.substring(1));
        System.out.println(a.substring(0, a.length()-1));
        System.out.println("SUBSTRING=> ");
        for(int i=0;i<a.length();i++){
            System.out.println(a.substring(i));
        }
    }
}
