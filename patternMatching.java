import java.util.*;

public class patternMatching {
    public static boolean check(String s,String t){
        String words[]=t.split(" ");
        if(words.length!=s.length())
        return false;
        HashMap<Character,String>map=new HashMap<>();
        HashMap<String,Character>map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            String currentWord=words[i];
            if(map.containsKey(currentChar)){
                if(map.get(currentChar)!=currentWord){
                    return false;
                }
            }
                else{
                    map.put(currentChar,currentWord);
                }
            if(map2.containsKey(currentWord)){
                if(map2.get(currentWord)!=currentChar){
                    return false;
                }
            }
                else{
                    map2.put(currentWord,currentChar);
                }
            }
            return true;
        }
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String s=ob.nextLine();
        String t=ob.nextLine();
        System.out.println(check(s,t));
        ob.close();
    }
}
