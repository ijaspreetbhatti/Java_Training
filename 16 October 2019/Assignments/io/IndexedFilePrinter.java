import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
/**
 * IndexedFilePrinter
 */
public class IndexedFilePrinter {
    public static void main(String[] args) throws IOException{
        File dataFile = new File("LinedData.txt");
        BufferedReader reader = new BufferedReader(new FileReader(dataFile));
        String line;
        int lineNumber = 1;
        while((line = reader.readLine()) != null){
            System.out.println(lineNumber++ + " " + line);
        }
        
    }
    
}