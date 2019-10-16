import java.util.*;
class TestDates {
  public static void main(String[] args) {
    Date d1 = new Date(1_000_000_000_000L);      // a trillion, Java 7 style
    System.out.println("1st date " + d1.toString());

      d1.setTime(d1.getTime() + 3_600_000); // 3_600_000 millis / hour 
     System.out.println("new time " + d1.toString());
} }