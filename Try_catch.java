import java.util.Scanner;

public class Try_catch {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a=ob.nextInt();
        int b=ob.nextInt();
        try{
            int c=a/b;
            System.out.println("Result=> "+c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        ob.close();
    }
}
