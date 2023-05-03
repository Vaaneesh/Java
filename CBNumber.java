import java.util.Scanner;

public class CBNumber {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String n;
        System.out.println("Enter no.");
        n=ob.nextLine();
        int len=n.length();
        System.out.println("Answer=>");
        for(int i=1;i<=len;i++){
            for(int j=0;j<=(len-i);j++){
                System.out.print(n.substring(j,i+j)+" ");
            }
            // System.out.println();
        }
        ob.close();
    }
}
