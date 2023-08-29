import java.util.Scanner;

class first_occurance{
    public static int Search(int index,int arr[],int key,int x){
        if(x==index){
            return -1;
        }
        if(arr[x]==key){
            return x;
        }
        return Search(index,arr,key,x+1);
    }
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
            System.out.println(Search(n-1, arr, key,0));
            ob.close();
        }
    }
}