import java.io.File;
import java.util.Scanner;
/**
 * FileProgram
 */
public class FileProgram{

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        System.out.println("To Copy File to File");
        System.out.println("Source file name : ");
        String source = scan.nextLine();

        System.out.println("Target file name : ");
        String target = scan.nextLine();

        CopyDataThread cDataThread = new CopyDataThread(new File(source), new File(target));
        cDataThread.start();
        scan.close();
    }
}