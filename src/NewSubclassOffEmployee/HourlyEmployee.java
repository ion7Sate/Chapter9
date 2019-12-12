package NewSubclassOffEmployee;

public class HourlyEmployee extends Employee {

    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String serialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, serialSecurityNumber);
        setHours(hours);
        setWage(wage);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0)
            throw new IllegalArgumentException("Hours must be  between 0.0 and 168.0");

        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("Wage must be > 0");

        this.wage = wage;
    }

    public double getEarnings(double hours) {
        double earning = 0;
        if (hours < 40.0) {
            earning = hours * wage;
        }
        if (hours > 40) {
            earning = 40 * wage + (hours - 40) * (wage * 1.5);
        }
        return earning;
    }

    @Override
    public String toString() {
        return super.toString() +
                " hours = " + hours +"\n"+
                " wage = " + wage +"\n"+
                " earning = " + getEarnings(hours) +"\n"+
                '}';
    }
}

