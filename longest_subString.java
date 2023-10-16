import java.util.*;

public class longest_subString {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter String");
        String s=ob.next();
        longest_subString obj=new longest_subString();
        System.out.println(obj.Check(s));
        ob.close();
    }
    public int Check(String str){
        int n=str.length();
        int maxlen=1;
        for(int i=0;i<n-1;i++){
            boolean visited[]=new boolean[128];
            visited[str.charAt(i)]=true;
            for(int j=i+1;j<n;j++){
                if(visited[str.charAt(j)]){
                    break;
                }
                visited[str.charAt(j)]=true;
                maxlen=Math.max(maxlen, j-i+1);
            }
        }
        return maxlen;
    }
}
