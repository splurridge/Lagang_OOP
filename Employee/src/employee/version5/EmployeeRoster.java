package employee.version5;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeRoster {
    public static int MAX = 5;
    public static int count = 0;
    private ArrayList<Employee> empList = new ArrayList();

    public EmployeeRoster() {
    }

    public EmployeeRoster(int max) {
        MAX = max;
    }

    public boolean addEmp(Employee emp) {
        if (count < MAX) {
            empList.add(emp);
            return true;
        } else {
            System.out.println("\nError! This Employee Roster is FULL.");
            return false;
        }
    }

    public boolean deleteEmp(int ID) {
        int i, empCount = 0;
        for(Employee emp : empList) {
            i = emp.getEmpID();
            if(i == ID) {
                empList.remove(empCount);
                System.out.printf("\nEmployee ID [ %d ] is successfully removed.", ID);
                return true;
            }
            empCount++;
        }
        return false;
    }

    public Employee getEmp(int ID) {
        int i = 0;
        for(Employee emp : empList) {
            i = emp.getEmpID();
            if(i == ID) {
                System.out.printf("\nEmployee ID [ %d ] is successfully obtained.", ID);
                return emp;
            }
        }
        return null;
    }

    public boolean updateEmp(int ID) {
        int i = 0, j;
        MyDate newDate = new MyDate(27, 10, 1989);
        for(Employee emp : empList) {
            j = emp.getEmpID();
            if(ID == j) {
                emp.setEmpBirthDate(newDate);
                System.out.printf("\nEmployee ID [ %d ] is successfully updated.", ID);
                return true;
            }
        }
        return false;
    }

    private String getType(Employee emp) {
        if (emp instanceof HourlyEmployee) {
            return "Hourly Employee";
        }
        else if(emp instanceof PieceWorkerEmployee) {
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

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public int countHourlyEmployee() {
        int countHE = 0;
        for(Employee emp : empList) {
            if (emp instanceof HourlyEmployee)
                countHE++;
        }
        return countHE;
    }

    public int countPieceWorkerEmployee() {
        int countPWE = 0;
        for(Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee)
                countPWE++;
        }
        return countPWE;
    }

    public int countCommissionEmployee() {
        int countCE = 0;
        for(Employee emp : empList) {
            if (emp instanceof CommissionEmployee)
                countCE++;
        }
        return countCE;
    }

    public int countBasePlusCommissionEmployee() {
        int countBPCE = 0;
        for(Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee)
                countBPCE++;
        }
        return countBPCE;
    }

    public String addRemarks(Employee emp) {
        if (emp instanceof HourlyEmployee) {
            return "Total Hours Worked: " + ((HourlyEmployee)emp).getTotalHoursWorked();
        }
        else if(emp instanceof PieceWorkerEmployee) {
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
        for(Employee emp : empList) {
            if (emp instanceof HourlyEmployee) {
                System.out.println(emp);
            }
        }
    }

    public void displayPieceWorkerEmployee() {
        for(Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) {
                System.out.println(emp);
            }
        }
    }

    public void displayCommissionEmployee() {
        for(Employee emp : empList) {
            if (emp instanceof CommissionEmployee) {
                System.out.println(emp);
            }
        }
    }

    public void displayBasePlusCommissionEmployee() {
        for(Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                System.out.println(emp);
            }
        }
    }

    public void displayAllEmployees() {
        System.out.println("\n***************************************** CURRENT EMPLOYEE ROSTER *************************************************");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-8s | %-32s | %-23s | %-12s | %-28s  \n","ID", "Name", "Type", "Salary", "Remarks");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        for(Employee emp : empList) {
            System.out.printf("| %-5s | %-32s | %-23s | ₱ %-10s | %-28s \n", emp.getEmpID(), emp.getEmpName(), this.getType(emp), emp.computeSalary(), addRemarks(emp));
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }
}
