import java.util.HashMap;

public class LongestConsequtiveSeq {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]-1)){
                map.put(arr[i],false);
            }
            else{
                map.put(arr[i],true);
            }
            if(map.containsKey(arr[i]+1)){
                map.put(arr[i]+1,false);
            }
        }
        System.out.println(map);
    }
}
