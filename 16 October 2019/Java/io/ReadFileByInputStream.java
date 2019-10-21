
import java.io.File;
import java.io.FileInputStream;
 
public class ReadFileByInputStream
{
    public static void main(String args[])
    {
        final String myFileName="anotherFile.txt";
         
        try
        {
            File myFile=new File(myFileName);
            if(myFile.exists()==false)
            {
                System.out.println("File doesn't exist!!!");
                System.exit(0);
            }
             
            //Let's try to read the contents of file, now that it exists
            int value;
         
            //object of FileOutputStream
            FileInputStream fileIn=new FileInputStream(myFile);
            //read text from file one int at a time
            System.out.println("Content of the file is: ");
            while((value = fileIn.read())!=-1)
            {
                System.out.print((char)value);
            }   
             
            System.out.println();   
             
            fileIn.close();         
        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }
}