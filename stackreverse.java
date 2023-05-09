import java.util.Stack;

public class stackreverse {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int val=st.pop();
        reverse(st);
        pushbottom(val,st);
    }
    public static void pushbottom(int val, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int item=st.pop();
        pushbottom(val, st);
        st.push(item);
    }
}
