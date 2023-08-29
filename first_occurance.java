import java.util.Scanner;

class first_occurance{
    public static void main(String args[]){
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("Enter size");
            int n=ob.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=ob.nextInt();
            }
            System.out.println("Enter key");
            int key=ob.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i]==key){
                    System.out.println("Position=> "+i);
                    return;
                }
            }
            ob.close();
        }
    }
}