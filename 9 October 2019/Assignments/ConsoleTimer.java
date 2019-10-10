/**
 * ConsoleTimer
 */
public class ConsoleTimer extends Thread {

    public static void main(String[] args) {
        ConsoleTimer myTimer = new ConsoleTimer();

        myTimer.start();
    }

    @Override
    public void run() {
        int time = 0;
        while (true) {
            System.out.print(time++);
            System.out.print("\r");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Sleep Failed!!!");
            }
        }
    }
}
