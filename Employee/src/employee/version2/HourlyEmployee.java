package employee.version2;

public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private float ratePerHour;

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public double computeSalary() {

        double totalSalary;

        if(this.totalHoursWorked > 40) {
            totalSalary = (40 * this.ratePerHour) + ((this.totalHoursWorked - 40)*(this.ratePerHour + (this.ratePerHour * 0.50)));
        }
        else {
            totalSalary = this.totalHoursWorked * this.ratePerHour;
        }

        return totalSalary;
    }

    public void displayInfo() {
        System.out.printf("\nHours worked: %.2f\nRate per hour: ₱ %.02f \nTotal salary: ₱ %.02f\n", totalHoursWorked, ratePerHour, computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTotal hours worked: " +this.totalHoursWorked +
                "\nRate per hour: " + this.ratePerHour;
    }
}
