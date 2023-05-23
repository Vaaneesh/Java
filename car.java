public class car {
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
}
