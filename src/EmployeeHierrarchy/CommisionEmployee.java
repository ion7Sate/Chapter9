package EmployeeHierrarchy;

public class CommisionEmployee extends Employee {
    private double grossSales;
    private double commisionRate;

    public CommisionEmployee(String firstName, String lastName, String serialSecurityNumber,double grossSales,double commisionRate){
        super(firstName,lastName,serialSecurityNumber);
        setGrossSales(grossSales);
        setCommisionRate(commisionRate);
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        if(commisionRate <=0.0 || commisionRate >=1.0){

        throw new IllegalArgumentException("Commision Rate must be > 0.0 and <1");
    }
        this.commisionRate = commisionRate;
}

    @Override
    public String toString() {
        return super.toString()+
                " grossSales=" + grossSales +"\n"+
                " commisionRate=" + commisionRate +"\n"+
                '}';
    }
}
