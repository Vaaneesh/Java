import java.util.ArrayList;
import java.util.Scanner;

public class KmpLite {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string and pat");
        String s=ob.nextLine();
        String pat=ob.next();
        ArrayList<Integer>list=new ArrayList<>();
        int index=0;
        while(index!=-1){
            index=s.indexOf(pat,index);
            if(index!=-1){
                list.add(index);
                index++;
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        ob.close();
    }
}
