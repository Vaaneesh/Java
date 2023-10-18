import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter String");
        String str=ob.nextLine();
        String reverseWord="";
        String s[]=str.split(" ");
        for(String ch: s){
            StringBuilder sb=new StringBuilder(ch);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        System.out.println(reverseWord);
        ob.close();
    }
}
