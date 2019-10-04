import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * SplitFunction
 */
public class SplitFunction {
    public static void main(String[] args) {
        String inputString, splitDelimiter;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string you want to split: ");
        inputString = scan.nextLine();
        System.out.println("Enter the string delimiter: ");
        splitDelimiter = scan.nextLine();
        
        System.out.println("Splits are:");
        for (String var : splitStrings(inputString, splitDelimiter)) {
            System.out.println(var);
        }
    }

    static String[] splitStrings(String inputString, String splitDelimiter){
        List<String> strings = new ArrayList<String>();
        String tempString;
        int itr = 0;
        boolean flag = true;
        
        if(inputString.contains(splitDelimiter)){
            tempString = inputString;
            do{
                int loc = tempString.indexOf(splitDelimiter);
                strings.add(tempString.substring(0, loc));
                tempString = tempString.substring(loc+splitDelimiter.length(), tempString.length());
                if(!tempString.contains(splitDelimiter)){
                    strings.add(tempString);
                    flag=false;
                }
            } while(flag);
        } else {
            strings.add(inputString);
        }
        String[] tokens = new String[strings.size()];
        tokens = strings.toArray(tokens);
        return tokens;
    }
}