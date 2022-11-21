import java.nio.file.*;

import java.nio.file.attribute.*;

import java.io.IOException;

public class FindSelectedFiles {

public static void main(String[] args) {

Path f1 = Paths.get("/root/sandbox/autoexec.bat");

Path f2 = Paths.get("/root/sandbox/CompareFolders.java");

Path f3 = Paths.get("/root/sandbox/FileStatistics.class");

Path f4 = Paths.get("/root/sandbox/Hello.doc");

//initializing count of existing files to 0

int count = 0;

//using exists method of Files class taking a path, checking if f1 exists

if (Files.exists(f1)) {

//updtaing count

count++;

}

//doing the same for other paths too

if (Files.exists(f2)) {

count++;

}

if (Files.exists(f3)) {

count++;

}

if (Files.exists(f4)) {

count++;

}

//displaying the number of files exist

System.out.println(count + " of the files exist.");

}

}
