import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String st[]={"eat","tea","tan","ate","nat","bat"};
        HashMap<String,List<String>>map=new HashMap<>();

        for(int i=0;i<st.length;i++){
            String key= genratekey(st[i]);
            if(map.containsKey(st[i])){
                map.get(key).add(st[i]);
            }
            else{
                List<String>list=new ArrayList<>();
                list.add(st[i]);
                map.put(key,list);
            }
            System.out.println(key);
        }
    }
    private static String genratekey(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']=arr[ch-'a']+1;
        }
        StringBuilder sb=new StringBuilder();
        for(int a:arr){
            sb.append(a);
        }
        return sb.toString();
    }
}
