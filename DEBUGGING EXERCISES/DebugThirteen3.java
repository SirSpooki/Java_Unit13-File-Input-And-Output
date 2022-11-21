//Chapter 13 (File Input and Output), Java Programming, joyce Farrell, 8th edit

//DebugThirteen3.java

//output, need to fix

// Crestes a file of entrees sold at a restaurant
import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
import java.util.Scanner;
public class DebugThirteen3
{
public static void main(String[] args) throws Exception
{
Path file =
Paths.get("/root/sandbox/DebugData3.txt"); //check folder named Chapter.13 inside Java folder in C drive, if it is not present then create it.
Scanner kb = new Scanner(System.in); // write System.in as parameter in Scanner Class
String[] array = new String[2];
String string = "";
String delimiter = ",";
String entree;
String price;
final String QUIT = "ZZZ";
try
{
OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
System.out.print("Enter first entrée or " + QUIT + " to quit >> ");
entree = kb.nextLine();
while(!entree.equals(QUIT))
{
System.out.print("Enter price >> ");
price = kb.nextLine();
string = entree + delimiter + price +
System.getProperty("line.separator");
writer.write(string, 0, string.length());
System.out.print("Enter next entrée or " + QUIT + " to quit >> "); //Enter ZZZ in capital letters to exit
entree = kb.nextLine();
}
writer.close();
}
catch(Exception e)
{
System.out.println("Message: " + e);
}
}
}
