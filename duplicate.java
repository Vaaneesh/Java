import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String str=ob.next();
        String ans="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i+1)!=str.charAt(i))
            ans+=str.charAt(i);
        }
        ans+=str.charAt(str.length()-1);
        System.out.println(ans);
        ob.close();
    }
}
