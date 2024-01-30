import java.util.HashMap;
import java.util.Scanner;

public class maximumOccurence {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        int count=0;
        char ans=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
            if(map.get(c)>count){
                count=map.get(c);
                ans=c;
            }
        }
        System.out.println(ans);
        ob.close();
    }
}
