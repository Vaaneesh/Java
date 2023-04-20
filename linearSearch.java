import java.util.Scanner;

public class linearSearch {
    public static void main(String args[]){
       int n,c;
       c=0;
       Scanner ob=new Scanner(System.in);
       n=ob.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter elements");
       for(int i=0;i<n;i++){
          arr[i]=ob.nextInt();
       }
       System.out.println("Enter element to search");
       int key=ob.nextInt();
       for(int i=0;i<n;i++){
          if(arr[i]==key)
          c=1;
       }
       if(c==1)
         System.out.println("Found");
       else
        System.out.println("Error not found");
       
       ob.close(); 
    }
}
