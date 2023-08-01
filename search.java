import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("enter ele to be searched");
        int key=ob.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("index= "+i);
                c++;
            }
        }
        if(c==0)
        System.out.println(-1);
        ob.close();
    }
}
