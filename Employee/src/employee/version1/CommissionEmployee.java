package employee.version1;

public class CommissionEmployee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private double totalSales;
    private String sales;

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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

    public CommissionEmployee() {
    }

    public CommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public double computeSalary() {

        double totalSalary = 0;

        if (totalSales < 50000) {
            totalSalary = totalSales * 0.05;
            sales = "Low Sales";
        } else if (totalSales >= 50000 && totalSales < 100000) {
            totalSalary = totalSales * 0.20;
            sales = "Typical Sales";
        } else if (totalSales >= 100000 && totalSales < 500000) {
            totalSalary = totalSales * 0.30;
            sales = "Typical Sales";
        } else if (totalSales >= 500000) {
            totalSalary = totalSales * 0.50;
            sales = "High Sales";
        }
        return totalSalary;
    }

    public void displayInfo() {
        double employeeSalaryCommission = computeSalary();
        System.out.printf("\nTotal sales: ₱ %.02f\nSales: %s\nCommission: ₱ %.02f\n", totalSales, sales, employeeSalaryCommission);
    }

    @Override
    public String toString() {
        return "\nID: " + this.empID +
                "\nName: " + this.empName +
                "\nDate Hired: " + this.empDateHired +
                "\nBirth Date: " + this.empBirthDate +
                "\nTotal sales: " + this.totalSales;
    }
}
