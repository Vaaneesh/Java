import java.util.Scanner;

public class arrayIndices {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size and ele");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int ind[]=new int[n];
        for(int i=0;i<n;i++){
            ind[i]=i;
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    temp=ind[j];
                    ind[j]=ind[j+1];
                    ind[j+1]=temp;
                }
            }
        }
        for(int i:ind){
            System.out.print(i+" ");
        }
        ob.close();
    }
}
