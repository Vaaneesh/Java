import java.util.ArrayList;
import java.util.Scanner;

public class indexes {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string and pattern");
        String s=ob.next();
        String pat=ob.next();
        ob.close();
        int m,n;
        n=s.length();
        m=pat.length();
        ArrayList<Integer>indexes=new ArrayList<>();
        for(int i=0;i<=n-m;i++){
            int j;
            for( j=0;j<m;j++){
                if(s.charAt(i+j)!=pat.charAt(j))
                break;
            }
            if(m==j)
            indexes.add(i+1);
        }
        System.out.println(indexes);
    }
}
