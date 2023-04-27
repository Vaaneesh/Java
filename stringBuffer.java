public class stringBuffer {
    public static void main(String[] args) {
        String s="abc";
        StringBuffer ob=new StringBuffer(s);
        System.out.println(ob);
        
        // Difference between String & String buffer=>
        // String = slow whereas String buffer=fast;
        // int start=(int)System.currentTimeMillis();
        // for(int i=0;i<10000;i++){
        //     s+="a";
        // }
        // int end=(int)System.currentTimeMillis();
        // System.out.println(end-start);

        // start=(int)System.currentTimeMillis();
        // for(int i=0;i<10000;i++){
        //     ob=ob.append("a");
        // }
        // end=(int)System.currentTimeMillis();
        // System.out.println(end-start);

        ob.setCharAt(1,'Z');
        System.out.println(ob);
    }
}
