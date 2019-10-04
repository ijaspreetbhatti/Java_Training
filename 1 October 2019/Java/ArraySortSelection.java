import java.util.Scanner;
class ArraySortSelection{
	public static void main(String[] args) {
		int temp;

		Scanner scan = new Scanner(System.in);
		// 01 02 03 04
		// 12 13 14
		// 23 24
		// 34

		int []arr = new int[5];

		System.out.println("PLease enter 5 numbers");

		for(int index = 0; index < arr.length; index++){
			arr[index] = scan.nextInt();
		}
// 12 1 45 22 567
//45 1 12 22 567
//567 1 12 22 45
//567 45 22 12 1
		
		for(int a = 0; a < arr.length; a++){
			for(int b = a + 1; b < arr.length; b++){
				if(arr[a] > arr[b]){
					temp = arr[a];
					arr[a] = arr[b];
					arr[b]= temp;
				}
			}
		}

		System.out.println("After sorting: ");

		for (int value : arr) {
			System.out.println(value);
		}
	}
}