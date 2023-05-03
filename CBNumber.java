import java.util.Scanner;
public class CBNumber {
    public static boolean CBN(int n){
        if(n!=0 && n!=1){
            int arr[]={2,3,5,7,9,11,13,17,19,23,29};
            for(int k:arr){
                if(n==k){
                    return true;
                }
            }
            for(int k:arr){
                if(n%k==0)
                return false;
            }
        }
        else{
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String n;
        System.out.println("Enter no.");
        n=ob.nextLine();
        int len=n.length();
        System.out.println("Answer=>");
        for(int i=1;i<=len;i++){
            for(int j=0;j<=(len-i);j++){
                String k=n.substring(j,i+j);
                if(CBN(Integer.parseInt(k))){
                    System.out.println(k);
                }
                // System.out.print(n.substring(j,i+j)+" ");
            }
            // System.out.println();
        }
        ob.close();
    }
}
