import java.util.Scanner;

/**
 * PalindromeCheck
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        String inputString;
        boolean flag = true;
        int itr;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string to check if it is a palindrome or not: ");
        inputString = scan.nextLine();

        itr = 0;
        for(int i = (inputString.length() - 1); i>=0; i--){
            if (inputString.charAt(itr) != inputString.charAt(i)) flag = false;
            itr++;
        }

        if (flag) {
            System.out.println("Entered String is a Palindrome!");
        } else {
            System.out.println("Entered String is not a Palindrome!");            
        }

    }
}