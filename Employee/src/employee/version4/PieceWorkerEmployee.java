package employee.version4;

public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private float ratePerPiece;

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

    public PieceWorkerEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
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
        return super.toString() +
                "\nTotal pieces finished: " + this.totalPiecesFinished +
                "\nRate per piece: " + this.ratePerPiece;
    }
}
