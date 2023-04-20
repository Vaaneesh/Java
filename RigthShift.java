public class RigthShift {
    public static void main(String args[]){
        int n=8;
        int count=0;
        // while(n!=0){
        //     if((n&1)!=0){
        //         count++;
        //     }
        //     n>>=1;
        // }
        while(n!=0){
            n=n &(n-1);
            count++;

        }
        System.out.println(count);
    }
}
