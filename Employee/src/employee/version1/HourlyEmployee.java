package employee.version1;

public class HourlyEmployee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public MyDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(MyDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public MyDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(MyDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

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
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
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
        return "\nID: " + this.empID +
                "\nName: " + this.empName +
                "\nDate Hired: " + this.empDateHired +
                "\nBirth Date: " + this.empBirthDate +
                "\nTotal hours worked: " + this.totalHoursWorked +
                "\nRate per hour: " + this.ratePerHour;
    }
}
