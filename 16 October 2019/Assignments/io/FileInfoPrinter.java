import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
/**
 * FileInfoPrinter
 */
public class FileInfoPrinter {
    public static void main(String[] args) throws IOException{
        File dataFile = new File("LinedData.txt");
        BufferedReader reader = new BufferedReader(new FileReader(dataFile));
        String line;
        int numberOfLines = 0;
        int numberOfCharacters = 0;
        int numberOfWords = 0;

        while((line = reader.readLine()) != null){
            numberOfLines++;
            numberOfCharacters += line.length();
            numberOfWords += line.split(" ").length;
        }
        
        System.out.println("Lines: " + numberOfLines + " Words: " + numberOfWords + " Characeters: " + numberOfCharacters);
    }
}