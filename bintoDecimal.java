import java.util.Scanner;

public class bintoDecimal {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int s=0;
        int i=0;
        while(n>0){
            int r=n%10;
            s+=r*(int)(Math.pow(2,i));
            i++;
            n/=10;
            
        }
        System.out.println(s);
        ob.close();
    }
}
