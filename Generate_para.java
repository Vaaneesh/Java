
import java.util.*;

public class Generate_para {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        List<String> list=new ArrayList<String>();
        check(list,"",0,0,n);
        System.out.println(list);
        ob.close();
    }
    public  static void check(List<String> list,String s,int open,int close,int max){
        if(s.length()==max*2){
            list.add(s);
            return;
        }
        if(open<max){
            check(list,s+"(",open+1,close,max);
        }
        if(close<open){
            check(list, s+")", open, close+1, max);
        }
    }
}
