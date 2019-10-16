import java.io.*;
import java.util.Scanner;

/**
 * FileInspector
 */
public class FileInspector {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName;

        System.out.println("Enter FileName:");
        fileName = scan.nextLine();
        File file = new File(fileName);

        String fileType = "";
        int index = file.getName().lastIndexOf('.');
        if (index > 0) {
            fileType = fileName.substring(index+1);
        }
        System.out.println("File Exists : " + file.exists()
                        + " File Readable : " + file.canRead()
                        + " File Writable : " + file.canWrite()
                        + " File Type :" + fileType
                        + " File Length :" + file.length());
    }
}