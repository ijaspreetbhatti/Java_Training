import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;
/**
 * SalaryCheck
 */
public class SalaryCheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee Salary: ");
        try {
            if(scan.nextInt()<3000) throw new EmployeeException();
        } catch (EmployeeException aue) {
            aue.employeeException();
        }
    }
}