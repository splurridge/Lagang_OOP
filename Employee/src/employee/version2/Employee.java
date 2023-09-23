package employee.version2;

public class Employee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;

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

    public Employee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public Employee() {
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "\nID: " + this.empID +
                "\nName: " + this.empName +
                "\nDate Hired: " + this.empDateHired +
                "\nBirth Date: " + this.empBirthDate;
    }
}


