import java.util.Scanner;

class ArraySortBubble{
    public static void main(String[] args) {
        int temp;
         
        Scanner scan = new Scanner(System.in);
        int []arr = new int[5];
 
        System.out.println("Please enter 5 numbers");
 
        for(int index = 0; index < arr.length; index++){
            arr[index] = scan.nextInt();
        }
         
        for (int a = 0; a < (arr.length - 1); a++) {
      		for (int b = 0; b < (arr.length - 1 - a); b++) {
		        if (arr[b] > arr[b+1]) {
		          temp = arr[b];
		          arr[b] = arr[b+1];
		          arr[b+1] = temp;
		        }
		    }
    	}
 
        System.out.println("After sorting: ");
 
        for (int value : arr) {
            System.out.println(value);
        }
    }
}