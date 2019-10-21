// File IO - java.io
import java.io.File;
class FileIOStarter{
	public static void main(String[] args) throws java.io.IOException {
		
		//Wouldn't create a file if it doesn't exist
		File myFile = new File("myNewFile.txt");

		System.out.println(myFile.exists());

		//Create a new file
		myFile.createNewFile();

		System.out.println("Now? " + myFile.exists());


	}
}


