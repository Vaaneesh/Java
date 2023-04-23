import java.util.*;
class triplets{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("enter size");
        n=ob.nextInt();
        int c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if((arr[i]+arr[j]==arr[k]) || (arr[i]+arr[k]==arr[j]) || (arr[k]+arr[j]==arr[i])){
                        c++;
                    }
                }
            }
        }
        System.out.println("Total triplets= "+c);
        ob.close();
    }
}