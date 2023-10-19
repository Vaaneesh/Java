import java.util.Scanner;

public class Contact_card {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter total ");
        int n=ob.nextInt();
        String arr[][]=new String[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=ob.next();
            }
        }
        System.out.println("Enter str");
        String str=ob.next();
        ob.close();
        for(int i=0;i<n;i++){
            if(str.equals(arr[i][0])){
                System.out.println(arr[i][0]);
                System.out.println(arr[i][1]);
                System.out.println(arr[i][2]);
                return;
            }
        }
        System.out.println(-1);
    }
}
