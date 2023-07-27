import java.util.*;
class decToBinary{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int i=0;
        int s=0;
        while(n>0){
            int r=n%2;
            s+=r*(int)Math.pow(10,i);
            i++;
            n=n/2;
        }
        System.out.println(s);
        ob.close();
    }
}