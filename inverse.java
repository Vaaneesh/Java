import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int s=0;
        while(n>0){
            s=(n%10)+s*10;
            n/=10;
        }
        System.out.println(s);
        ob.close();
    }
}
