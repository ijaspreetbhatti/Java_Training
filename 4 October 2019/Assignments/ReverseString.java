import java.util.Scanner;

/**
 * ReverseString
 */
public class ReverseString {
    public static void main(String[] args) {
        String inputString, revString;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string to reverse the string: ");
        inputString = scan.nextLine();

        revString = new String();
        for(int i = (inputString.length() - 1); i >= 0; i--){
            revString += inputString.charAt(i);
        }

        System.out.println("The reverse of the entered string is: " + revString);
    }
}