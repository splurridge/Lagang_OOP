package employee.version1;

public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;

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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public double computeSalary() {
        double totalSalary;

        if(this.totalPiecesFinished < 100) {
            totalSalary = this.totalPiecesFinished * this.ratePerPiece;
        }
        else {
            int temp = this.totalPiecesFinished / 100;
            totalSalary = (this.totalPiecesFinished * this.ratePerPiece) + (temp * (this.ratePerPiece * 10));

        }
        return totalSalary;
    }

    public void displayInfo() {
        System.out.printf("\nTotal pieces finished: %d\nRate per piece: ₱ %.02f\nTotal salary: ₱ %.02f\n", totalPiecesFinished, ratePerPiece, computeSalary());
    }

    @Override
    public String toString() {
        return "\nID: " + this.empID +
                "\nName: " + this.empName +
                "\nDate Hired: " + this.empDateHired +
                "\nBirth Date: " + this.empBirthDate +
                "\nTotal pieces finished: " + this.totalPiecesFinished +
                "\nRate per piece: " + this.ratePerPiece;
    }
}
