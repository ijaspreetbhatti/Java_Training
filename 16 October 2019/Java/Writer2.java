import java.io.*;
class Writer2 {
public static void main(String [] args) throws IOException {
char[] in = new char[100]; // to store input
int size = 0;
File file = new File("anotherFile.txt"); //Again this is just an object
 try {
 

FileWriter fw = new FileWriter(file); // create an actual file
// & a FileWriter obj
fw.write("Hello\nguys\nhow\nare\nyou\ndoing\nwe\nare\nalmost\ndone\nwith\ncore"); // write characters to
// the file
fw.flush(); // flush before closing
fw.close(); // close file when done
} catch(IOException e) {
	System.out.println("Can't write to the file currently...");
 }

// FileReader fr =
// new FileReader(file); // create a FileReader
// // object
// size = fr.read(in); // read the whole file!
// System.out.print(size + " "); // how many bytes read
// for(char c : in) // print the array
// System.out.print(c);
//fr.close(); // again, always close








StringBuilder sb = new StringBuilder("");

BufferedReader br = new BufferedReader(new FileReader(file));
String str = "";
while((str = br.readLine()) != null)
{
	sb.append(str);
}
br.close();
// fr.close();
System.out.println("Contents from file are : " + sb);
 
}

 }