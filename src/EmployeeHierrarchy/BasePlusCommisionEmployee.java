package EmployeeHierrarchy;

public class BasePlusCommisionEmployee extends CommisionEmployee{

    private double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, String serialSecurityNumber,double grossSales,double commisionRate,double baseSalary){
        super(firstName,lastName,serialSecurityNumber,grossSales,commisionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString()+
                " baseSalary=" + baseSalary +"\n"+
                '}';
    }
}
