import java.util.Scanner;

/**
 * Library
 */
public class Library {
    ArrayList itemList = new ArrayList();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean menuRefresh = true;
        do {
            System.out.println("Welcome to Library Management: ");
            System.out.println("Items in Library are ");
            /* System.out.println("1. Add Item 2. Remove Item 3. Print List 4. Check-in item 5. Check-out item");
            switch(scan.nextInt()) {
                case 1:
                        break;
                case 2:
                        break;
                case 3:
                        break;
                case 4:
                        break;
                case 5:
                        break;
                default:
                        break;
            } */
        } while(menuRefresh);
    }
}