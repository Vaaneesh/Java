import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
            String n=ob.nextLine();
            n=' '+n;
            String j="";
            int len=n.length();
            int i;
            for(i=len-1;i>=0;i--){
                if(n.charAt(i)==' '){
                    System.out.print(j+" ");
                    j="";
                }
                else{
                    j=n.charAt(i)+j;
                }
            }
        ob.close();
    }
}
