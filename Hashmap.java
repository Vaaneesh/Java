import java.util.HashMap;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(3,"what");
        map.put(2,"sup");
        map.put(1, "yo");
        map.put(4, "you");
        map.put(5, "doing");
        System.out.println(map);        
        System.out.println(map.get(2));
        System.out.println(map.containsKey(20));
        System.out.println(map.keySet()); //helps in Loop
        System.out.println("        Loop Starts         ");
        Set <Integer>set=map.keySet();
        for(int a:set){
            System.out.println(a+": "+map.get(a));
        }
    }
}
