import java.util.Scanner;

public class codingBlockTest {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();
        while(num-->0){
            int even,odd;
            even=odd=0;
            int n=ob.nextInt();
            while(n>0){
                int r=n%10;
                if(r%2==0)
                even+=r;
                else
                odd+=r;
                n=n/10;
            }
            if(even%4==0 || odd%3==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            even=0;
            odd=0;
        }
        ob.close();
    }
}
