public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1=new Employee("efe",14,250,false);
        System.out.println(emp1.getIsRetired());
        boolean bon=emp1.deserveBonus();
        double sala=emp1.calculateSalary(10,20);
        emp1.setWorkingyear(21);
        System.out.println(emp1.getIsRetired());
        System.out.println(sala);


    }
}
