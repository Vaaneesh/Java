import java.util.Scanner;
public class Subsequences {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        String s="abc";
        // int n=s.length();
        // int total=(int)Math.pow(2, n);
        int total=1<<s.length();
        System.out.println(total);
        for(int i=0;i<total;i++){
            int n=i;
            int pos=0;
            while(n!=0){
                if((n&1)!=0){
                    System.out.print(s.charAt(pos));
                }
                n>>=1;
                pos++;
            }
            System.out.println();
        }
        ob.close();
    }
}
