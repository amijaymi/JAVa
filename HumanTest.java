public class HumanTest {
    public static void main(String[] args){
        System.setProperty("user.dir", "/path/to/your/directory");
        Human i1=new Human();
        Human i2=new Human();

        i1.setAge(22);
        i1.setName("Ayse");
        i1.greet();





        System.out.println("Age is "+ i1.age);
        System.out.println("Name is "+ i1.name);

    }
    
}

