import java.util.Scanner;

public class Highest_occuring {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String str=ob.nextLine();
        int ch[]=new int[2];
        int arr[]=new int[256];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                arr[str.charAt(i)]=arr[str.charAt(i)]+1;
            }
        }
        int largest=Integer.MIN_VALUE;
        for(int j=0;j<str.length();j++){
            int k=arr[str.charAt(j)];
            if(k>largest){
                largest=k;
                ch[0]=largest;
                ch[1]=str.charAt(j);
            }
        }
        System.out.println(ch[0]+" "+(char)ch[1]);
        ob.close();
    }
}
