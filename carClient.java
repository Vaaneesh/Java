public class carClient {
    public static void main(String[] args) {
        car arr[]=new car[5];
        car c=new car();
        arr[0]=new car(1200,100,"white");
        arr[1]=new car(2000,150,"black");
        arr[2]=new car(1500,110,"blue");
        arr[3]=new car(2200,170,"red");
        arr[4]=new car(3200,200,"gravity grey");
        c.display(arr);
        c.sort(arr);
    }
}
