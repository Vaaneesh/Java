public class DynamicStack extends stackFunctions{
    @Override
    public void push(int val)throws Exception{
        if(isfull()){
            int newarr[]=new int[2* this.arr.length];
            for(int i=0;i<arr.length;i++){
                newarr[i]=arr[i];
            }
            arr=newarr;
        }
        super.push(val);
    }    
}
