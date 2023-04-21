public class Student_client {
    public static void main(String[] args) {
        Student st=new Student();
        Student st2=new Student();
        st.age=20;
        st2.age=21;
        st2.name="Vaaneesh";
        st.name="Vasu";
        st.intro();
        st2.intro();
    }
}
