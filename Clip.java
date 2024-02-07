public class Clip {
    private int bulletCapacity;
    private int currentBullet;
    public Clip(int bulletCapacity,int currentBullet){
        this.bulletCapacity=bulletCapacity;
        this.currentBullet=currentBullet;

    }
    public boolean firing(){
        if (this.bulletCapacity>0){
            this.currentBullet-=1;
            System.out.println("the number of remainer bullet"+ this.currentBullet);
            return true;
        }
        else{
           return false; 
        }
    }
    public void filling(){
        this.currentBullet=this.bulletCapacity;
        System.out.println("the number of remainer bullet"+ this.currentBullet);

    }
}
