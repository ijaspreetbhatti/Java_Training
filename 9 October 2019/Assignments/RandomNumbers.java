/**
 * RandomNumbers
 */
public class RandomNumbers extends Thread {

    public static void main(String[] args) {
        RandomNumbers randGen = new RandomNumbers();
        randGen.start();
    }

    @Override
    public void run() {
        while (true) {
            int rand = (int) (System.currentTimeMillis()/1000) - 1570610700;
            if (rand%2==0) System.out.print(" " + (rand/2));
            else System.out.print(" " + (rand/3));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Sleep Failed!!!");
            }
        }
    }
}