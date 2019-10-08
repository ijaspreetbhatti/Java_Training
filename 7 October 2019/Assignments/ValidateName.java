import java.util.Scanner;
/**
 * ValidateName
 */
public class ValidateName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = "", lastName = "";

        System.out.println("Enter First Name: ");
        firstName = scan.next();
        try {
            if(firstName == "") throw new EmptyStringException();
        } catch (EmptyStringException ese) {
            ese.firstNameEmpty();
        }
        System.out.println("Enter Last Name: ");
        lastName = scan.next();
        try {
            if(lastName == "") throw new EmptyStringException();
        } catch (EmptyStringException ese) {
            ese.lastNameEmpty();
        }

    }
}

/**
 * EmptyStringException    
 */
class EmptyStringException extends Exception {

    void firstNameEmpty() {
        System.out.println("Empty First Name");
    }
    
    void lastNameEmpty() {
        System.out.println("Empty Last Name");
    }
}