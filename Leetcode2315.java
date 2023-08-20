import java.util.Scanner;

public class Leetcode2315{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string containing '|' and '*'");
        String s=ob.next();
        int c=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|')
            c++;
            if(s.charAt(i)=='*' && c%2==0){
                ans++;
            }
        }
        System.out.println(ans);
        ob.close();
    }
}