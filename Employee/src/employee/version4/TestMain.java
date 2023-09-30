package employee.version4;

public class TestMain {
    public static void main(String[] args) {
        Name nameEmp1 = new Name("Francis James", "Alagadan", "Lagang");
        Name nameEmp2 = new Name("Taylor", "Alison", "Swift");
        Name nameEmp3 = new Name("Jack", "Michael", "Antonoff");
        Name nameEmp4 = new Name("Omar", "Charles", "Apollo");

        MyDate dateBirth = new MyDate(1,1,2004);
        MyDate dateHired = new MyDate(23,9,2023);

        Employee emp1 = new HourlyEmployee(22104403, nameEmp1, dateBirth, dateHired, 40, 200);
        Employee emp2 = new PieceWorkerEmployee(22104404, nameEmp2, dateBirth, dateHired, 300, 60);
        Employee emp3 = new CommissionEmployee(22104405, nameEmp3, dateBirth, dateHired, 35000);
        Employee emp4 = new BasePlusCommissionEmployee(22104406, nameEmp4, dateBirth, dateHired, 35000, 25000);

        EmployeeRoster list = new EmployeeRoster(10);

        list.addEmp(emp1);
        list.addEmp(emp2);
        list.addEmp(emp3);
        list.addEmp(emp4);

        list.displayAllEmployees();

        System.out.println("\nNumber of Hourly Employees: " + list.countHourlyEmployee());
        System.out.println("Active Hourly Employees: ");
        list.displayHourlyEmployee();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nNumber of Piece Worker Employees: " + list.countPieceWorkerEmployee());
        System.out.println("Active Piece Worker Employees: ");
        list.displayPieceWorkerEmployee();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nNumber of Commission Employees: " + list.countCommissionEmployee());
        System.out.println("Active Commissions Employees: ");
        list.displayCommissionEmployee();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nNumber of Base Plus Commission Employees: " + list.countBasePlusCommissionEmployee());
        System.out.println("Active Base Plus Commission Employees: ");
        list.displayBasePlusCommissionEmployee();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        list.deleteEmp(22104403);
        System.out.println("\n");
        list.displayAllEmployees();
        System.out.println("\n");

        Employee empCatch = list.getEmp(22104404);
        System.out.println(empCatch);
        list.updateEmp(22104405);
        System.out.println(empCatch);
    }
}
