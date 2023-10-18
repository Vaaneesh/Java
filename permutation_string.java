import java.util.Arrays;
import java.util.Scanner;

public class permutation_string {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1=ob.next();
        String s2=ob.next();
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2){
            System.out.println("Not permutable");
        }
        else{
            char ch1[]=s1.toCharArray();
            char ch2[]=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for(int i=0;i<l1;i++){
                if(ch1[i]!=ch2[i]){
                    System.out.println("not permutable");
                    return;
                }
            }
            System.out.println("Permutable");
        }
        ob.close();
    }
}
