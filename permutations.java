import java.util.*;

public class permutations {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=ob.nextInt();
        }
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        permutate(nums,nums.length,0,list);
        ob.close();
    }
    public static void permutate(int arr[],int l,int ind,List<List<Integer>> ans){
        if(ind==l){
            List<Integer>l2=new ArrayList<>();
            for(int i:arr){
                l2.add(i);
            }
            ans.add(l2);
            System.out.println(ans);
        }
        for(int i=0;i<l;i++){
            swap(arr,i,ind);
            permutate(arr, l, ind+1, ans);
            swap(arr,i,ind);
        }
    }
    public static void swap(int arr[],int a1,int a2){
        int temp=arr[a1];
        arr[a1]=arr[a2];
        arr[a2]=temp;
    }
}
