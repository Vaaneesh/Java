import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s="abc@nfjsdbisb@fbierbfien@fudhsiufbe ";
        String arr[]=s.split("@");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        ob.close();
    }
}
