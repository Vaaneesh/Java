import java.util.Scanner;

public class toss {
    public static void toss2(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
           toss2(n-1,ans+"H");
        }
        toss2(n-1,ans+"T");
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no of toss");
        int n=ob.nextInt();
        toss2(n,"");
        ob.close();
    }
}
