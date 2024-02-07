public class Employee {
    private String essn;
    private double pricebyhour;
    private int workyear;
    private boolean isRetired;
    public Employee(String essn, double pricebyhour,int workyear,boolean isRetired){
        this.essn=essn;
        this.pricebyhour=pricebyhour;
        this.workyear=workyear;
        this.isRetired=isRetired;
    
    }
    public int getWorkingYear(){
        
        return workyear;
    }
    
    public boolean getIsRetired(){
        return this.isRetired;
    }
    
    public void setIsretired(boolean isRetired){
        if (this.workyear>=20){
            this.isRetired=true;
            
        }
    

    }
    public void setWorkingyear(int workyear){
        this.workyear=workyear;
        
    }
    
    public boolean deserveBonus(){
        if (this.workyear>=10&&this.workyear<20){
            return true;
        }
        return false;
    }
    public double calculateSalary(int workHours,int workDays){
        return workHours*this.pricebyhour*workDays;
    }
    public void retiring(){
        if(this.workyear>=20){
            isRetired=true;
            


        }
    }
    

}
