import java.util.scanner;
public class Automobile {
    Scanner s=new Scanner(System.in);
    private int speed;
    private String gear;//auto gear only 2 direction forward or backwward
    private String wheelDirection;
    private String tyreDirection;
    private boolean isWorking;
    private double runtime=0;
    private int fuel=30;
    public Automobile(speed,gear,wheelDirection,tyreDirection,isWorking){
        this.speed=speed;
        this.gear=gear;
        this.wheelDirection=wheelDirection;
        this.tyreDirection=tyreDirection;

    }
    public int calculateSpeed(int value){
        this.speed+=value;
        
        return this.speed;
    }
    public void chanheGear(){
        if(isWorking!=true){
            System.out.println("Which direction you want to go print f for forward b for backward: ");
            char d=s.next().charat(0);
            if(d=='f'){
                this.tyreDirection="Forward";
            }
            else{
                this.tyreDirection="Backward";
            }
            
        }
    }
    public void direction(String dir){
        this.wheelDirection=dir;
        
    }
    public boolean isWorking(){
        if(this.speed==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void fuelController(){


    }
}
