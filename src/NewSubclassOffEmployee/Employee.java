package NewSubclassOffEmployee;

public class Employee {

    protected final String firstName;
    protected final String lastName;
    protected final String serialSecurityNumber;


    public Employee(String firstName, String lastName, String serialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.serialSecurityNumber = serialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSerialSecurityNumber() {
        return serialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee{ " +"\n"+
                " firstName = '" + firstName +"\n"+
                " lastName = '" + lastName +"\n"+
                " serialSecurityNumber = '" + serialSecurityNumber+"\n";
    }
}
