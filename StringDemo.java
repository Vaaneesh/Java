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
        String d="nitin";
        for(int i=0;i<d.length();i++){
            for(int j=i+1;j<d.length();j++){
                String s3=d.substring(i, j);
                int n=s3.length();
                String s4="";
                for(int k=n-1;k>=0;k--){
                    s4+=s3.charAt(k);
                }
                if(s4.equals(s3))
                System.out.println(s3+" Palindrome");
                else
                System.out.println(s3+" Not palindrome");
            }
        }
        String s1="yoyoy";
        String s2="";
        int n=s1.length();
        for(int i=n-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not palindrome");
    }
}
