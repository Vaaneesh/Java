public class SubstringPalindrome {
    public static void main(String[] args) {
        String s="nitin";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String s3=s.substring(i, j);
                int n=s3.length();
                String s4="";
                for(int k=n-1;k>=0;k--){
                    s4+=s3.charAt(k);
                }
                if(s4.equals(s3))
                System.out.println(s3+" Palindrome");
                // else
                // System.out.println(s3+" Not palindrome");
            }
        }
    }
}
