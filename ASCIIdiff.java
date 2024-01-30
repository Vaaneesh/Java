import java.util.Scanner;

public class ASCIIdiff {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            char curr=s.charAt(i);
            char next=s.charAt(i+1);
            sb.append(curr);
            sb.append(next-curr);
        }
        sb.append(s.charAt(s.length()-1));
        System.out.println(sb.toString());
        ob.close();
    }
}
