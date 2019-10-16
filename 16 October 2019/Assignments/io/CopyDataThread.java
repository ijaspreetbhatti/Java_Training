import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InterruptedException;

/**
 * CopyDataThread
 */
public class CopyDataThread extends Thread {
    File fromFile, toFile;
    FileReader copyReader;
    FileWriter copyWriter;

    CopyDataThread(File fromFile, File toFile) {
        this.fromFile = fromFile;
        this.toFile = toFile;
    }

    @Override
    public void run() {

        try {
            this.copyReader = new FileReader(this.fromFile);
            try {
                this.copyWriter = new FileWriter(this.toFile);
                copier();
            } catch (FileNotFoundException efnf) {
                try {
                    toFile.createNewFile();
                    copier();
                } catch (IOException eio) {
                    System.out.println("Can't Create Target File");
                }
            } catch (IOException eio) {
                System.out.println("Can't Access File");
            }
        } catch (FileNotFoundException efnf) {
            System.out.println("Source File Doesn't Exist");
        } catch (IOException eio) {
            System.out.println("Can't Access Source File");
        }
    }

    void copier() {
        try {
            int data;
            int counter = 0;

            while ((data = this.copyReader.read()) != -1) {
                this.copyWriter.write(((char) data));
                counter++;
                if (counter == 10) {
                    counter = 1;
                    System.out.println("10 characters are copied");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        System.out.println("Failed to Sleep");
                    }
                }
            }
            try {
                this.copyReader.close();
                this.copyWriter.close();
            } catch (IOException e) {
                System.out.println("Can't close");
            }
            System.out.println("File Copied");

        } catch (IOException e) {
            System.out.println("Can't Access the Files");
        }
    }

}
