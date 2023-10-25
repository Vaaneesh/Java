import java.util.*;

public class balanced_para {
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("Enter string containing paraenthesis");
            String s=ob.next();
            char ch[]=s.toCharArray();
            Stack<Character> st=new Stack<Character>();
            for(char c:ch){
                if(c=='(' || c=='{' || c=='['){
                    st.push(c);
                }
                else{
                    if((st.peek()=='{') && c=='}' || (st.peek()=='[') && c==']' || (st.peek()=='(')&& c==')'){
                        st.pop();
                    }
                }
                if(st.empty()){
                    System.out.println("True");
                    return;
                }
            }
            System.out.println("false");
            ob.close();
        }
    }
}

