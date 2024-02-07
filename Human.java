public class Human {
    private int age;
    private String name;
    
    public Human(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void greet(){
        System.out.println(("hi"+ this.name));
    }
    public void greetsomeone(Human one){

    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age=age;
    }
}
