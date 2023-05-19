import java.util.Arrays;
import java.util.Scanner;

public class permutable {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String s1=ob.nextLine();
        String s2=ob.nextLine();
        int n1=s1.length();
        int n2=s2.length();
        char c[]=new char[n1];
        char c2[]=new char[n2];
        int count=0;
        for(int i=0;i<n1;i++)
        c[i]=s1.charAt(i);
        for(int i=0;i<n2;i++)
        c2[i]=s2.charAt(i);
        Arrays.sort(c);
        Arrays.sort(c2);
        if(n1==n2){
            for(int i=0;i<n1;i++){
                if(c[i]!=c2[i]){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("permutable");
            }
            else{
                System.out.println("Not permutable");
            }
        }
        ob.close();
    }    
}
