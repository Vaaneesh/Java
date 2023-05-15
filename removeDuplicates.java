import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.nextLine();
        int n=s.length();
        String ans=""+s.charAt(0);
        for(int i=1;i<=n-1;i++){
            if(s.charAt(i)!=s.charAt(i-1))
            ans+=s.charAt(i);
        }
        System.out.println(ans);
        ob.close();
    }
}
