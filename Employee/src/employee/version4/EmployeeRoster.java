package employee.version4;

public class EmployeeRoster {
    public static int MAX = 5;
    public static int count = 0;
    private Employee[] empList = new Employee[MAX];

    public EmployeeRoster() {

    }

    public EmployeeRoster(int max) {
        MAX = max;
    }

    public boolean addEmp(Employee emp) {
        if (count < MAX) {
            empList[count] = emp;
            count++;
            return true;
        } else {
            System.out.println("\nError! This Employee Roster is FULL.");
            return false;
        }
    }

    public boolean deleteEmp(int ID) {
        Employee[] newList = new Employee[count];
        int i, j = 0, k = 0;
        for(; j < count; j++) {
            i = empList[j].getEmpID();
            if(ID != i) {
                newList[k] = empList[j];
                k++;
            }
        }
        if(k != j) {
            count--;
            empList = newList;
            System.out.printf("\nEmployee ID [ %d ] is successfully removed.", ID);
            return true;
        }
        else {
            return false;
        }
    }

    public Employee getEmp(int ID) {
        int i = 0, j;
        for(; i < count; i++) {
            j = empList[i].getEmpID();
            if(ID == j) {
                System.out.printf("\nEmployee ID [ %d ] is successfully obtained.", ID);
                return empList[i];
            }
        }
        return null;
    }

    public boolean updateEmp(int ID) {
        int i = 0, j;
        MyDate newDate = new MyDate(27, 10, 1989);
        for(;i < count; i++) {
            j = empList[i].getEmpID();
            if(ID == j) {
                empList[i].setEmpBirthDate(newDate);
                System.out.printf("\nEmployee ID [ %d ] is successfully updated.", ID);
                return true;
            }
        }
        return false;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    private String getType(Employee emp) {
        if (emp instanceof HourlyEmployee) {
            return "Hourly Employee";
        }
        else if(emp instanceof employee.version4.PieceWorkerEmployee) {
            return "Piece Worker Employee";
        }
        else if(emp instanceof CommissionEmployee) {
            return "Commission Employee";
        }
        else if(emp instanceof BasePlusCommissionEmployee) {
            return "Base Plus Commission Employee";
        }
        else {
            return " ";
        }
    }

    public int countHourlyEmployee() {
        Employee[] LIST = this.getEmpList();
        int countHE = 0;
        for(int i = 0; i < count; i++) {
            if (LIST[i] instanceof HourlyEmployee) {
                countHE++;
            }
        }
        return countHE;
    }

    public int countPieceWorkerEmployee() {
        Employee[] LIST = this.getEmpList();
        int countPWE = 0;
        for(int i = 0; i < count; i++) {
            if (LIST[i] instanceof PieceWorkerEmployee) {
                countPWE++;
            }
        }
        return countPWE;
    }

    public int countCommissionEmployee() {
        Employee[] LIST = this.getEmpList();
        int countCE = 0;
        for(int i = 0; i < count; i++) {
            if (LIST[i] instanceof CommissionEmployee) {
                countCE++;
            }
        }
        return countCE;
    }

    public int countBasePlusCommissionEmployee() {
        Employee[] LIST = this.getEmpList();
        int countBPCE = 0;
        for(int i = 0; i < count; i++) {
            if (LIST[i] instanceof BasePlusCommissionEmployee) {
                countBPCE++;
            }
        }
        return countBPCE;
    }

    public String addRemarks(Employee emp) {
        if (emp instanceof HourlyEmployee) {
            return "Total Hours Worked: " + ((HourlyEmployee)emp).getTotalHoursWorked();
        }
        else if(emp instanceof employee.version4.PieceWorkerEmployee) {
            return "Total Pieces Finished: " + ((PieceWorkerEmployee)emp).getTotalPiecesFinished();
        }
        else if(emp instanceof CommissionEmployee) {
            return "Total Sales: " + ((CommissionEmployee)emp).getTotalSales();
        }
        else if(emp instanceof BasePlusCommissionEmployee) {
            return "Base Salary: " + ((BasePlusCommissionEmployee)emp).getBaseSalary();
        }
        else {
            return " ";
        }
    }

    public void displayHourlyEmployee() {
        Employee[] LIST = this.getEmpList();
        for(int i = 0; i < count; i++) {
            if (LIST[i] instanceof HourlyEmployee) {
                System.out.println(LIST[i]);
            }
        }
    }

    public void displayPieceWorkerEmployee() {
        Employee[] LIST = this.getEmpList();
        for(int i = 0; i < count; i++) {
            if (LIST[i] instanceof PieceWorkerEmployee) {
                System.out.println(LIST[i]);
            }
        }
    }

    public void displayCommissionEmployee() {
        Employee[] LIST = this.getEmpList();
        for(int i = 0; i < count; i++) {
            if (LIST[i] instanceof CommissionEmployee) {
                System.out.println(LIST[i]);
            }
        }
    }

    public void displayBasePlusCommissionEmployee() {
        Employee[] LIST = this.getEmpList();
        for(int i = 0; i < count; i++) {
            if (LIST[i] instanceof BasePlusCommissionEmployee) {
                System.out.println(LIST[i]);
            }
        }
    }

    public void displayAllEmployees() {
        Employee[] LIST = this.getEmpList();
        System.out.println("\n***************************************** CURRENT EMPLOYEE ROSTER *************************************************");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-8s | %-32s | %-23s | %-12s | %-28s  \n","ID", "Name", "Type", "Salary", "Remarks");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < count ; i++) {
            System.out.printf("| %-5s | %-32s | %-23s | ₱ %-10s | %-28s \n", LIST[i].getEmpID(), LIST[i].getEmpName(), this.getType(LIST[i]), LIST[i].computeSalary(), addRemarks(LIST[i]));
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }
}
