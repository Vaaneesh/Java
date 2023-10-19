import java.util.*;
public class Remove_String {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        ArrayList<String>ll=new ArrayList<>();
        System.out.println("enter size");
        int n=ob.nextInt();
        for(int i=0;i<n;i++){
            String   input=ob.next();
            ll.add(input);
        }
        System.out.println("Enter string");
        String str=ob.next();
        ArrayList<String>ans=new ArrayList<>();
        for(String s:ll){
            if(s.compareTo(str)>0)
            ans.add(s);
        }
        System.out.print(ans);
        ob.close();
    }
}

