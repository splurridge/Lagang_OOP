package employee.version6;

public class BasePlusCommissionEmployee extends Employee {
    private double baseSalary;
    private double totalSales;
    private String sales;

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public BasePlusCommissionEmployee() {

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        double salary = 0;
        if (totalSales < 50000) {
            salary = totalSales * 0.05;
            sales = "Low Sales";
        } else if (totalSales >= 50000 && totalSales < 100000) {
            salary = totalSales * 0.20;
            sales = "Typical Sales";
        } else if (totalSales >= 100000 && totalSales < 500000) {
            salary = totalSales * 0.30;
            sales = "Typical Sales";
        } else if (totalSales >= 500000) {
            salary = totalSales * 0.50;
            sales = "High Sales";
        }
        salary += baseSalary;
        return salary;
    }

    public void displayInfo() {
        double employeeSalaryCommission = computeSalary();
        System.out.printf("\nTotal sales: ₱ %.02f\nSales: %s\nCommission: ₱ %.02f\n", totalSales, sales, employeeSalaryCommission);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase salary: " + this.baseSalary;
    }
}