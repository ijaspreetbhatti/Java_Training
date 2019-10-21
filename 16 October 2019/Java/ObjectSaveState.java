// Serialization : Saving the object's state to a file
import java.io.*;
class ObjectSaveState{
	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
		Student student = new Student("Bhavana", "female");
		Student secondStudent = new Student("Roshan", "male");

		ObjectStatePersistence osp = new ObjectStatePersistence();

		osp.saveToFile(student);
		//osp.saveToFile(secondStudent);

		new ObjectStatePersistence().readFromFile();
	}
}


class ObjectStatePersistence{
	void saveToFile(Student theStudent) throws FileNotFoundException, IOException{
		FileOutputStream outputStream = new FileOutputStream(new File("objectData.txt"));
		ObjectOutputStream os = new ObjectOutputStream(outputStream);

		//Save the state
		os.writeObject(theStudent);

	}


	void readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException{
	ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("objectData.txt")));

	//Read object data
	Student ref = (Student) inputStream.readObject();
	// Student other = (Student) inputStream.readObject();

	//Check whether we were able to read object data
	System.out.println("Details : " + ref);
	// System.out.println("Details : " + other);

	}



}


