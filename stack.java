import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(7);
        st.push(30);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Element at top= "+st.peek());
        // while(!st.isEmpty()){
        //     st.pop();
        // }
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }
}
