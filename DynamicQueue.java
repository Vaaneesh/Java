public class DynamicQueue extends queue {
    @Override
    public void add(int val)throws Exception{
        if(isfull()){
            int newarr[]=new int[2* this.arr.length];
            for(int i=0;i<size;i++){
                newarr[i]=arr[front];
                front=(front+1)%arr.length;
            }
            arr=newarr;
        }
        super.add(val);
    }    
}
