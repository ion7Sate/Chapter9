package EmployeeHierrarchy;

public class BasePlusCommisonEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommisionEmployee baseEmployee = new BasePlusCommisionEmployee(
                "Tina","Caster","45des78y540",2500,0.24,1000);
        System.out.println("First name is : "+baseEmployee.getFirstName());
        System.out.println("Last name is : "+baseEmployee.getLastName());
        System.out.println("Serial security number is: "+baseEmployee.getSerialSecurityNumber());
        System.out.println("Gross salary is : "+baseEmployee.getGrossSales());
        System.out.println("Commision rate is: "+baseEmployee.getCommisionRate());
        System.out.println("Base salary is :"+baseEmployee.getBaseSalary());

        baseEmployee.setBaseSalary(1000);

        System.out.println("Information obtained bu toString "+baseEmployee);
    }
}
