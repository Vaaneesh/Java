import java.util.*;

public class Kth_element {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter linked list");
        List<Integer> list=new java.util.LinkedList<>();
        while(true){
            int n=ob.nextInt();
            if(n==-1)
            break;
            list.add(n);
        }
        int ind=ob.nextInt();
        System.out.println(list.get(list.size()-ind));
        ob.close();
    }
}
