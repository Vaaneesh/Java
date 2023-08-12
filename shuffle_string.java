import java.util.Scanner;

class shuffle_string{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        System.out.println("Enter indices");
        int ind[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            ind[i]=ob.nextInt();
        }
        char ans[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            int target=ind[i];
            ans[target]=s.charAt(i);
        }
        System.out.println(String.valueOf(ans));
        ob.close();
    }
}