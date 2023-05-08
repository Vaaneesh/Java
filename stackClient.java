public class stackClient {
    public static void main(String[] args) throws Exception {
        stackFunctions st=new stackFunctions();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.isEmpty()); 
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println("Size= "+st.Size());
        
    }
}
