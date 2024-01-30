import java.util.Scanner;

public class AbhishekPrefix {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter two strings");
        String s=ob.next();
        String t=ob.next();
        int c=0;
        for(int i=0;i<t.length();i++){
            if(c==s.length())
            break;
            if(t.charAt(i)==s.charAt(c))
            c++;
        }
        System.out.println(c);
        ob.close();
    }
}
