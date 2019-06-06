package Basic_A0;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class ByteArray {
    private static void usage () {
        System.err.println("java Cat1 <file>");

        System.err.println(" A <file> argument is mandatory");

        System.exit(1);
    }

    public static void main(String args[]) {
        if (args.length != 1)
            usage();

        Path path = Paths.get(args[0]);

        try {
            byte[] content = Files.readAllBytes(path);

            for (int i=0; i<content.length; i++)
                System.out.print((char) content[i]);
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
            System.exit(1);
        }
    }
}
