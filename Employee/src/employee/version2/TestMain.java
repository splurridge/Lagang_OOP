package employee.version2;

public class TestMain {
    public static void main(String[] args) {
        MyDate dateBirth = new MyDate(1,1,2004);
        MyDate dateHired = new MyDate(16,9,2023);

        System.out.println("----- HOURLY EMPLOYEE -----");

        HourlyEmployee HourEmp1 = new HourlyEmployee();
        HourEmp1.setEmpID(22104403);
        HourEmp1.setEmpName("Francis Lagang");
        HourEmp1.setEmpDateHired(dateHired);
        HourEmp1.setEmpBirthDate(dateBirth);
        HourEmp1.setTotalHoursWorked(40);
        HourEmp1.setRatePerHour(200);

        HourlyEmployee HourEmp2 = new HourlyEmployee(22104404, "James Lagang", dateHired, dateBirth);
        HourEmp2.setTotalHoursWorked(60);
        HourEmp2.setRatePerHour(400);

        HourlyEmployee HourEmp3 = new HourlyEmployee(22104405, "Franz Lagang", dateHired, dateBirth, 40, 250);

        System.out.println(HourEmp1);
        System.out.println("\nSALARY INFORMATION:");
        HourEmp1.displayInfo();

        System.out.println(HourEmp2);
        System.out.println("\nSALARY INFORMATION:");
        HourEmp2.displayInfo();

        System.out.println(HourEmp3);
        System.out.println("\nSALARY INFORMATION:");
        HourEmp3.displayInfo();

        System.out.println("\n----- PIECE WORKER EMPLOYEE -----");

        PieceWorkerEmployee PieceWorkEmp1 = new PieceWorkerEmployee();
        PieceWorkEmp1.setEmpID(22104403);
        PieceWorkEmp1.setEmpName("Francis Lagang");
        PieceWorkEmp1.setEmpDateHired(dateHired);
        PieceWorkEmp1.setEmpBirthDate(dateBirth);
        PieceWorkEmp1.setTotalPiecesFinished(300);
        PieceWorkEmp1.setRatePerPiece(60);

        PieceWorkerEmployee PieceWorkEmp2 = new PieceWorkerEmployee(22104404, "James Lagang", dateHired, dateBirth);
        PieceWorkEmp2.setTotalPiecesFinished(555);
        PieceWorkEmp2.setRatePerPiece(50);

        PieceWorkerEmployee PieceWorkEmp3 = new PieceWorkerEmployee(22104405, "Franz Lagang", dateHired, dateBirth, 350, 60);

        System.out.println(PieceWorkEmp1);
        System.out.println("\nSALARY INFORMATION:");
        PieceWorkEmp1.displayInfo();

        System.out.println(PieceWorkEmp2);
        System.out.println("\nSALARY INFORMATION:");
        PieceWorkEmp2.displayInfo();

        System.out.println(PieceWorkEmp3);
        System.out.println("\nSALARY INFORMATION:");
        PieceWorkEmp3.displayInfo();

        System.out.println("\n\n----- COMMISSION EMPLOYEE -----");

        CommissionEmployee CommissionEmp1 = new CommissionEmployee();
        CommissionEmp1.setEmpID(22104403);
        CommissionEmp1.setEmpName("Francis Lagang");
        CommissionEmp1.setEmpDateHired(dateHired);
        CommissionEmp1.setEmpBirthDate(dateBirth);
        CommissionEmp1.setTotalSales(35000);

        CommissionEmployee CommissionEmp2 = new CommissionEmployee(22104404, "James Lagang", dateHired, dateBirth);
        CommissionEmp2.setTotalSales(40000);

        CommissionEmployee CommissionEmp3 = new CommissionEmployee(22104405, "Franz Lagang", dateHired, dateBirth, 60000);

        System.out.println(CommissionEmp1);
        System.out.println("\nSALARY INFORMATION:");
        CommissionEmp1.displayInfo();

        System.out.println(CommissionEmp2);
        System.out.println("\nSALARY INFORMATION:");
        CommissionEmp2.displayInfo();

        System.out.println(CommissionEmp3);
        System.out.println("\nSALARY INFORMATION:");
        CommissionEmp3.displayInfo();

        System.out.println("\n----- BASE + COMMISSION EMPLOYEE -----");

        BasePlusCommissionEmployee BasePlusCommissionEmp1 = new BasePlusCommissionEmployee();
        BasePlusCommissionEmp1.setEmpID(22104403);
        BasePlusCommissionEmp1.setEmpName("Francis Lagang");
        BasePlusCommissionEmp1.setEmpDateHired(dateHired);
        BasePlusCommissionEmp1.setEmpBirthDate(dateBirth);
        BasePlusCommissionEmp1.setTotalSales(35000);
        BasePlusCommissionEmp1.setBaseSalary(25000);

        BasePlusCommissionEmployee BasePlusCommissionEmp2 = new BasePlusCommissionEmployee(22104404, "James Lagang", dateHired, dateBirth);
        BasePlusCommissionEmp2.setTotalSales(60000);
        BasePlusCommissionEmp2.setBaseSalary(40000);

        BasePlusCommissionEmployee BasePlusCommissionEmp3 = new BasePlusCommissionEmployee(22104405, "Franz Lagang", dateHired, dateBirth, 550000, 50000);

        System.out.println(BasePlusCommissionEmp1);
        System.out.println("\nSALARY INFORMATION:");
        BasePlusCommissionEmp1.displayInfo();

        System.out.println(BasePlusCommissionEmp2);
        System.out.println("\nSALARY INFORMATION:");
        BasePlusCommissionEmp2.displayInfo();

        System.out.println(BasePlusCommissionEmp3);
        System.out.println("\nSALARY INFORMATION:");
        BasePlusCommissionEmp3.displayInfo();
    }
}
