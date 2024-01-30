import java.util.Scanner;

public class SummetricIntegers {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter two no.s");
        int low=ob.nextInt();
        int high=ob.nextInt();
        int count=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            int l=s.length();
            if(l%2==0 && s.substring(0,l/2).chars().sum()==s.substring(l/2).chars().sum()){
                count++;
            }
        }
        System.out.println(count);
        ob.close();
    }
}
