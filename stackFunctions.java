// import java.util.*;
public class stackFunctions {
    int size=0;
    int top=-1;
    int arr[]=new int[10];
    // public stackFunctions(){
    //     int arr[]=new int[10];
    // }
    // public stackFunctions(int cap){
    //     arr=new int[cap];
    // }
    public boolean isEmpty()throws Exception{
        if(top==-1){
            // return true;
            throw new Exception("Stack is empty");
        }
        return false;
    }
    public boolean isfull(){
        if(top==arr.length-1){
            return true;
        }
        return false;
    }
    public void push(int val){
        if(isfull()){
            new Exception("Stack is full");
        }
        top++;
        arr[top]=val;
        size++;
    }
    public void pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        top--;
        size--;

    }
    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int n=arr[top];
        return n;
    }
    public int Size(){
        return size;
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
