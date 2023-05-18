import java.util.Scanner;

public class interchange {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<90){
                System.out.print((char)(s.charAt(i)+32));
            }
            else{
                System.out.print((char)(s.charAt(i)-32));
            }
        }
    ob.close();
    }
}
