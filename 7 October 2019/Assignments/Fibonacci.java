import java.util.Scanner;
/**
 * Fibonacci
 */
public class Fibonacci {
    int counter = -1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstInt = 0, secondInt = 0, nthLoc = 0;

        System.out.println("Enter Two intial numbers and location of nth value");
        firstInt = scan.nextInt();
        secondInt = scan.nextInt();
        nthLoc = scan.nextInt();
        System.out.println("Recursive Func nth value: " + new Fibonacci().recursiveFunc(firstInt, secondInt, nthLoc));
        System.out.println("Non Recursive Func nth value: " + new Fibonacci().nonRecursiveFunc(firstInt, secondInt, nthLoc));
    }

    public int recursiveFunc(int firstInt, int secondInt, int nthLoc) {
        if(counter==-1) counter = nthLoc;
        if(counter!=2){
            int temp = firstInt;
            firstInt = secondInt;
            secondInt += temp;
            counter--;
            return recursiveFunc(firstInt, secondInt, nthLoc);
        }
        return secondInt;
    }

    public int nonRecursiveFunc(int firstInt, int secondInt, int nthLoc) {
        counter = nthLoc;
        while(counter!=2){
            int temp = firstInt;
            firstInt = secondInt;
            secondInt += temp;
            counter--;
        }
        return secondInt;
    }
}