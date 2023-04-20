public class squareroot {
    public static void main(String args[]){
        int n=56;
        // System.out.println((int)Math.sqrt(n));
        int s,e,mid;
        s=1;
        e=n;
        int c=0;
        while(s<=e){
            mid=s+(e-s)/2;
            if((mid*mid)<=n){
                c=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println("Ans= "+c);
    }
}
