import java.util.*;

public class HashMapp {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        HashMap<String,Integer>map=new HashMap<>();
        map.put("india",250);
        map.put("aus",150);
        map.put("china",350);
        System.out.println(map);
        for(Map.Entry<String,Integer>val:map.entrySet()){
            System.out.println(val.getValue());
        }
        ob.close();
    }
}
