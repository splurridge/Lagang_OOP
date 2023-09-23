package employee.version2;

public class CommissionEmployee extends Employee{
    private double totalSales;
    private String sales;

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public CommissionEmployee() {
    }

    public CommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
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
        return super.toString() +
                "\nTotal sales: " + this.totalSales;
    }
}
