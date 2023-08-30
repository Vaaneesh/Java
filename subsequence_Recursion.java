import java.util.Scanner;

public class subsequence_Recursion {
    private static void subseq(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        subseq(s.substring(1),ans);
        subseq(s.substring(1),ans+s.charAt(0));
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter String");
        String s=ob.next();
        subseq(s, "");
        ob.close();
    }
}
