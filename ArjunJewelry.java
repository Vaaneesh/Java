import java.util.*;
class Jewelry{
    double weight,value;
    Jewelry(double weight,double value){
        this.weight=weight;
        this.value=value;
    }
}
public class ArjunJewelry {
    public static double maxValue(Jewelry jew[],int w){
        Arrays.sort(jew,Comparator.comparingDouble(j->-j.value/j.weight));

        double total=0.0;
        int remainingWeight=w;
        for(Jewelry item:jew){
            if(remainingWeight>=item.weight){
                total+=item.value;
                remainingWeight-=item.weight;
            }
            else{
                total+=(remainingWeight/item.weight)*item.value;
                break;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter weightLimit");
        int w=ob.nextInt();
        Jewelry jew[]={new Jewelry(10,60),
            new Jewelry(20,100),
            new Jewelry(30, 120)
        };
        double res=maxValue(jew,w);
        System.out.println(res);
        ob.close();
    }   
}
