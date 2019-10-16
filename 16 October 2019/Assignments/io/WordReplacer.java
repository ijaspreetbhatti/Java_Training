import java.io.*;
import java.util.Scanner;
/**
 * WordReplacer
 */
public class WordReplacer {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String fileName, line, replacingWord, chosenWord;
        StringBuilder fileData = new StringBuilder();

        System.out.println("Enter FileName: ");
        fileName = scan.nextLine();
        File file = new File(fileName);

        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println("Data in File: ");
        while((line = reader.readLine()) != null){
            fileData.append(line + "\n");
            System.out.println(line);
        }

        System.out.println("Enter the word you want to replace: ");
        chosenWord = scan.nextLine();
        System.out.println("Enter the word you want to replace with: ");
        replacingWord = scan.nextLine();

        while(fileData.toString().contains(chosenWord)){
            fileData = fileData.replace(fileData.indexOf(chosenWord), fileData.indexOf(chosenWord) + chosenWord.length(), replacingWord);
        }

        reader.close();

        BufferedWriter writer= new BufferedWriter(new FileWriter(file));
        writer.write(fileData.toString());
        writer.close();
        System.out.println("Data written to file.");

        System.out.println("Data in File post replacement: ");
        reader = new BufferedReader(new FileReader(file));
        while((line = reader.readLine()) != null){
            fileData.append(line + "\n");
            System.out.println(line);
        }     
        reader.close();
    }
    
}