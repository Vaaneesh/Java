import java.util.Scanner;

public class celebrity {
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("Enter total no of people");
            int n=ob.nextInt();
            int arr[][]=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=ob.nextInt();
                }
            }
            int c=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if((arr[i][j]==1)&&(i!=j)){
                        c++;
                    }
                }
                if(c==0){
                    System.out.println(i);
                    return;
                }
                c=0;
            }
            System.out.println("No celeb");
            ob.close();
        }
    }
}
