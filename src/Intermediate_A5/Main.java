package Intermediate_A5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    public static void main(String[] args) throws IOException {

        /* CR research
        FileWriter fileWriter = new FileWriter("./src/Intermediate_A5/hello.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("New line?");
        printWriter.close();
         */

    Path path = Paths.get("./src/Intermediate_A5/hello.txt");
    System.out.println("path = "+path);
    System.out.println("exists = "+Files.exists(path));
    System.out.println("readable = "+Files.isReadable(path));
    System.out.println("writeable= "+Files.isWritable(path));
    System.out.println("executeable = "+Files.isExecutable(path));

    path = Paths.get("../Intemediate_A5/hello.txt");
    System.out.println("path = "+path);
    System.out.println("exists = "+Files.exists(path));
    System.out.println("readable = "+Files.isReadable(path));
    System.out.println("writeable= "+Files.isWritable(path));
    System.out.println("executeable = "+Files.isExecutable(path));


    }

}