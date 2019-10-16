import java.io.*;
class FileDirDemo
{
	public static void main(String[] args) {
	try{

File delDir = new File("deldir"); // make a directory, not yet

delDir.mkdir(); //Creates the directory now

File delFile0 = new File(delDir, "delFile0.txt"); // add file to directory
delFile0.createNewFile(); //Now create the file inside that folder:delDir

File delFile1 = new File(delDir, "delFile1.txt"); // add file to directory
delFile1.createNewFile(); //Now create the file inside that folder:delDir

File delFile2 = new File(delDir, "delFile2.txt"); // add file to directory
delFile2.createNewFile(); //This creates the new file

 //delFile1.delete(); // delete a file
System.out.println("delDir deleted " + delDir.delete()); // attempt to delete
// // the directory
File newName = new File(delDir, "newName.txt"); // a new object

delFile2.renameTo(newName); // rename file

File newDir = new File("newDirName"); // rename directory
delDir.renameTo(newDir);

String[] files = new String[100];
File search = new File("newDirName");
files = search.list(); // create the list
for(String fn : files) // iterate through it
System.out.println("found " + fn);
	}
	 catch(IOException e){
	 	e.printStackTrace();
	 }
}
	}