import java.util.Scanner;

/**
 * TrafficLights
 */
public class TrafficLights {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Traffic Light Simulator!");

        System.out.println("Choose what light color: 1. Red 2. Yellow 3. Green");

        switch ((scan.nextLine()).toUpperCase()) {
        case "RED":
                System.out.println("STOP");
            break;
        case "YELLOW":
                System.out.println("READY");
            break;
        case "GREEN":
                System.out.println("GO");
            break;

        default:
                System.out.println("WRONG INPUT");
            break;
        }

    }
}