import java.util.Scanner;
import java.util.Stack;

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
            Stack <Integer> st= new Stack<>();
            for(int i=0;i<n;i++){
                st.push(i);
            }
            while(st.size()!=1){
                int a=st.pop();
                int b=st.pop();
                if(arr[a][b]==1){
                    st.push(b);
                }
                else{
                    if(arr[b][a]==1){
                        st.push(a);
                    }
                }
            }
            // System.out.println(st);
            boolean flag=false;
            int ans=st.pop();
            for(int i=0;i<n;i++){
                if((i!=ans)&&(arr[ans][i]==1 || arr[i][ans]==0)){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println(-1);
            }
            else{
                System.out.println(ans);
            }


            //                           APPROACH -2 =>



            // for(int i=0;i<n;i++){
            //     for(int j=0;j<n;j++){
            //         arr[i][j]=ob.nextInt();
            //     }
            // }
            // int c=0;
            // for(int i=0;i<n;i++){
            //     for(int j=0;j<n;j++){
            //         if((arr[i][j]==1)&&(i!=j)){
            //             c++;
            //         }
            //     }
            //     if(c==0){
            //         System.out.println(i);
            //         return;
            //     }
            //     c=0;
            // }
            // System.out.println("No celeb");
            ob.close();
        }
    }
}
