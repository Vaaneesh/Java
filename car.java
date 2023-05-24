import java.util.Comparator;

// public class car implements Comparable<car> {
//     int price;
//     int speed;
//     String color;
public class car{
    int price;
    int speed;
    String color;


    public car(){

    }

    public car(int price,int speed,String color){
        this.price=price;
        this.speed=speed;
        this.color=color;

    }

    @Override
    public String toString(){
        return "P: "+this.price+" S: "+this.speed+" C: "+this.color;
    }
    void display(car arr[]){
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
    // @Override
    // public int compareTo(car o){
    //     return this.price-o.price;
    // }

    // public <T extends Comparable<T>> void sort(T arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr.length-1-i;j++){
    //             if(((car)arr[j]).compareTo((car)arr[j+1])>0){
    //                 T t=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=t;
    //             }
    //         }
    //     }
    //}
    public <T>void sort(T arr[],Comparator<T>camp ){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(camp.compare(arr[j],arr[j+1])>0){
                    T t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
}
