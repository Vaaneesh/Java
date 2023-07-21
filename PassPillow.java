import java.util.Scanner;

public class PassPillow {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        boolean increase=true;
        int pos=1;
        System.out.println("Enter n and time");
        int n=ob.nextInt();
        int time=ob.nextInt();
        while(time-->0){
            if(pos==n){
                increase=false;
            }
            if(pos==1){
                increase=true;
            }
            if(increase==true)
            pos++;
            else
            pos--;
        }
        System.out.println(pos);
        ob.close();
    }
}
