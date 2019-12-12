package EmployeeHierrarchy;



public class CommisionEmployeeTEst {
    public static void main(String[] args) {

    CommisionEmployee employee1 = new CommisionEmployee(
            "Adam","Braun","sf5y58ger86",2000,0.4);

        System.out.println("First name is : "+employee1.getFirstName());
        System.out.println("Last name is : "+employee1.getLastName());
        System.out.println("Serial security number is: "+employee1.getSerialSecurityNumber());
        System.out.println("Gross salary is : "+employee1.getGrossSales());
        System.out.println("Commision rate is: "+employee1.getCommisionRate());

        employee1.setCommisionRate(0.4);
        employee1.setGrossSales(2500);
        System.out.println("Information obtained by toString "+employee1);
} }
