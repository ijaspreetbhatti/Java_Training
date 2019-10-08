import java.io.FileReader;
import java.io.BufferedReader;
class TryResourcesDemo{
	public static void main(String[] args) throws java.io.FileNotFoundException, java.io.IOException {
		new TryResourcesDemo().work();
	}


	void work() throws java.io.FileNotFoundException, java.io.IOException{
		// BufferedReader reader = null;
		// try{
		// 	// Create the BufferedReader object
		// 	reader = new BufferedReader(new FileReader("someFile.txt"));

		// 	//Read a line from the file: someFile.txt
		// 	String textFromFile = reader.readLine();

		// 	//Display on the console
		// 	System.out.println("Data From File : " + textFromFile);

		// }
		// catch(java.io.IOException ex){
		// 	System.out.println("Some issues : " + ex);
		// }
		// finally{

		// 	try{
		// 	//Close the connection
		// 	reader.close();
		// }
		// catch(java.io.IOException ie){
		// 	System.out.println("Some issues while closing: " + ie);
		// }
		// }





		//OR Post Java 7: Try with resources syntax
		BufferedReader reader = new BufferedReader(new FileReader("someFile77.txt")); //Post Java 9.0
		try(reader){

			//Read a line from the file: someFile.txt
			String textFromFile = reader.readLine();

			//Display on the console
			System.out.println("Data From File : " + textFromFile);
		}
		catch(java.io.IOException ie){
			System.out.println("Issues in file handling : "+ ie);
		}

		
		
	}
}


