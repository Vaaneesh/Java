import java.util.*;
public class lcm {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter 2 numbers");
        n1=ob.nextInt();
        n2=ob.nextInt();
        int lcm=Math.max(n1, n2);
        while(true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.println("LCM of 2 numbers=> "+lcm);
                break;
            }
            lcm++;
        }
        ob.close();
    }
}
