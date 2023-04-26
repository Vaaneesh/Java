import java.util.Scanner;

public class GoodSubstring {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        int len=Integer.MIN_VALUE;
        String s2;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                s2=s.substring(i, j+1);
                if(isVowel(s2)){
                    if(len<s2.length()){
                        len=s2.length();
                    }
                }
            }
        }
        System.out.println(len);
        ob.close();
    }
    public static boolean isVowel(String s){
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if((a!='a') && (a!='e') && (a!='i')&&(a!='o')&&(a!='u')){
                return false;
            }
        }
        return true;
    }
}
