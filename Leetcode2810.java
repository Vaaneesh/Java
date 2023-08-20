import java.util.Scanner;

public class Leetcode2810{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i')
            ans.reverse();
            else
            ans.append(s.charAt(i));
        }
        System.out.println(ans.toString());
        ob.close();

    }
}