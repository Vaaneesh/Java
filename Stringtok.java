import java.util.StringTokenizer;

public class Stringtok {
    public static void main(String[] args) {
        // StringTokenizer st=new StringTokenizer("Yo sup");
        StringTokenizer st1=new StringTokenizer("Yoaa supll","o");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
        StringTokenizer st2=new StringTokenizer("Yoaa supll","o",true);
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}
