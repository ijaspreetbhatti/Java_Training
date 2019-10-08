import java.util.Scanner;
/**
 * PrimeTill
 */
public class PrimeTill {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number till you want prime numbers for:");
        new PrimeTill().getPrimeTillInt(scan.nextInt());
    }

    void getPrimeTillInt(int number){
        System.out.print("1 2 3");
        for(int i = 5; i < number; i++) {
            boolean flag = true;
            for(int j = 2; j<i/2; j++) if(i%j==0) flag = false;
            if (flag) System.out.print(" " + i);
        }
    }
}