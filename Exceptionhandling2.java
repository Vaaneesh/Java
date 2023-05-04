public class Exceptionhandling2 {
    //for Exception we can use PRIVATE Variables like private int age
    int age;
    String name;
    public int getAge(){
        return age;
    }
    public void setAge(int age)throws Exception{
        if(age<0){
            System.out.println("Age can't be -ve");
        }
        else{
            this.age=age;
        }
        if(age<0){
            throw new Exception("Age cant be -ve dumbfuck");
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    // public void intro(){
    //     System.out.println(name+" "+age);
        
    // }
}
