public class arraySwap{
    public static void main(String args[]){
        int a1[]={10,20};
        int b2[]={100,200};
        System.out.println(a1[0]+" "+b2[0]);
        swap(a1,b2);
        System.out.println(a1[0]+" "+b2[0]);
    }
    private static void swap(int a1[],int b2[]){
        int temp=a1[0];
        a1[0]=b2[0];
        b2[0]=temp;
        // int temp[]=a1;
        // a1=b2;
        // b2=temp; 
    }
}
