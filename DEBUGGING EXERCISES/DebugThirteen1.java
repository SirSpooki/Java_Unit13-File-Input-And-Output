// Program describes two files
// tells you which one is newer and which one is larger
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class DebugThirteen1
{
    public static void main(String[] args)
    {
        Path file1 =
                Paths.get("/root/sandbox/DebugDataOne1.txt"); // FIXED: .txt SHOULD BE APPENDED AFTER THE FILE NAME BECAUSE WITHOUT .TXT FILE NAME IS NOT COMPLETE
        Path file2 =
                Paths.get("/root/sandbox/DebugDataOne2.txt");
        try
        {
            BasicFileAttributes attr1 =
                    Files.readAttributes(file1, BasicFileAttributes.class);
            System.out.println("File: " + file1.getFileName()); // FIXED: INSTEAD OF file1getFileName(), IT SHOULD BE file1.getFileName()
            System.out.println("Creation time " + attr1.creationTime());
            System.out.println("Last modified time " + attr1.lastModifiedTime()); // FIXED: INSTEAD OF attr1lastModifiedTime(), IT SHOULD BE attr1.lastModifiedTime()
            System.out.println("Size " + attr1.size());
            BasicFileAttributes attr2 =
                    Files.readAttributes(file2, BasicFileAttributes.class);
            System.out.println("\nFile: " + file2.getFileName()); // FIXED: HERE THE METHOD CALL getFileName MISSED PARENTHESIS
            System.out.println("Creation time " + attr2.creationTime());
            System.out.println("Last modified time " + attr2.lastModifiedTime());
            System.out.println("Size " + attr2.size());
            if(attr1.creationTime().compareTo(attr2.creationTime()) > 0) // FIXED: INSTEAD OF compareto, IT SHOULD BE compareTo
                System.out.println("\n" + file1.getFileName() + " was created earlier");
            else
                System.out.println("\n" + file1.getFileName() + " was not created earlier");
            if(attr1.size() > attr2.size())
                System.out.println(file1.getFileName() + " is larger "); // FIXED: AFTER THE getFileName() METHOD CALL, THERE SHOULD BE A + FOR STRING CONCATENATION
            else
                System.out.println(file1.getFileName() + " is not larger"); // FIXED: AFTER THE getFileName() METHOD CALL, THERE SHOULD BE A + FOR STRING CONCATENATION
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
    }
}
