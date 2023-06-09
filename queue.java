public class queue {
    int front=0,size=0,rear=0;
    protected int arr[];
    public queue(){
        arr=new int[5];
    }
    public queue(int n){
        arr=new int[n];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isfull(){
        return size==arr.length;
    }
    public void add(int val)throws Exception{
        if(isfull()){
            throw new Exception("Queue is Full");
        }
        arr[rear]=val;
        rear++;
        size++;
    }
    public void remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        front=(front+1)%arr.length;
        size--;
    }
    public void display()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int i=0;
        int k=front;
        while(i<size){
            System.out.print(arr[k]+" ");
            k=(k+1)%arr.length;
            i++;
        }
        System.out.println();
    }

}

