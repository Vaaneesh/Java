public class try_CatchDemo {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int a=10;
        String s="";
        try{
            int k=a/0;
            arr[7]=28;
            System.out.println(k);
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{ //this block will run irrespective of the exception
            System.out.println("Finally");
            try{
                arr[7]=28;
                System.out.println(s.length());
            }
            catch(ArithmeticException e){
                e.printStackTrace();
            }
            catch(NullPointerException e){
                e.printStackTrace();
            }
            catch(ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }
    }
}
