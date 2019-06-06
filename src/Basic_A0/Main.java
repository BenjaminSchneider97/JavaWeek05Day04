package Basic_A0;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Main {
    /*
    private static void usage() {
        System.err.println("java CreateOrDelete <file>");
        System.err.println(" The <file> argument is required.");
        System.exit(1);
    }
    */
    public static void main(String[] args) {

        /*
        if (args.length != 1)
            usage();

        Path path = Paths.get(args[0]);
        try {
            if (Files.exists(path))
                Files.delete(path);
            else
                Files.createFile(path);
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }

     */

        Path path = Paths.get("./src/Basic_A0/test.txt");
        System.out.println("path = " + path);
        System.out.println(" exists = " + Files.exists(path));
        System.out.println(" readable = " + Files.isReadable(path));
        System.out.println(" writeable = " + Files.isWritable(path));
        System.out.println(" executeable = " + Files.isExecutable(path));

        path = Paths.get("/this_file_doesn 't_exist");

        System.out.println("path = " + path);
        System.out.println(" exists = " + Files.exists(path));
        System.out.println(" readable = " + Files.isReadable(path));
        System.out.println(" writeable = " + Files.isWritable(path));
        System.out.println(" executeable = " + Files.isExecutable(path));
    }
}