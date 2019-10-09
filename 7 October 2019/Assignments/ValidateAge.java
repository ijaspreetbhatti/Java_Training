import java.util.Scanner;
/**
 * ValidateAge
 */
public class ValidateAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        try {
            if(scan.nextInt()<15) throw new AgeUnder15Exception();
        } catch (AgeUnder15Exception aue) {
            aue.ageUnder15Exception();
        }
    }
}

class AgeUnder15Exception extends Exception{  
  
    void ageUnder15Exception() {
        System.out.println("Age of a person should be above 15");
    }

 }  