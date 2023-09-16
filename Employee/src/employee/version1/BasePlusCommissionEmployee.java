package employee.version1;

public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private double totalSales;
    private double baseSalary;
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        double totalSalary = 0;
        if (totalSales < 50000) {
            totalSalary = (totalSales * 0.05) + baseSalary;
            sales = "Low Sales";
        } else if (totalSales >= 50000 && totalSales < 100000) {
            totalSalary = (totalSales * 0.20) + baseSalary;
            sales = "Typical Sales";
        } else if (totalSales >= 100000 && totalSales < 500000) {
            totalSalary = (totalSales * 0.30) + baseSalary;
            sales = "Typical Sales";
        } else if (totalSales >= 500000) {
            totalSalary = (totalSales * 0.50) + baseSalary;
            sales = "High Sales";
        }
        return totalSalary;
    }

    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public void displayInfo() {
        double employeeSalaryCommission = computeSalary();
        System.out.printf("\nTotal sales: ₱ %.02f\nSales: %s\nBase salary: %.02f\nTotal Salary with Commission: ₱ %.02f\n", totalSales, sales, baseSalary, employeeSalaryCommission);
    }

    @Override
    public String toString() {
        return "\nID: " + this.empID +
                "\nName: " + this.empName +
                "\nDate Hired: " + this.empDateHired +
                "\nBirth Date: " + this.empBirthDate +
                "\nTotal sales: " + this.totalSales +
                "\nBase salary: " + this.baseSalary;
    }
}
