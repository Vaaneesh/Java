import java.util.Scanner;

public class primeFactors {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        while(n%2==0){
            System.out.print("2 ");
            n/=2;
        }   
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
        if(n>2)
        System.out.println(n);
        ob.close();
    }
}
