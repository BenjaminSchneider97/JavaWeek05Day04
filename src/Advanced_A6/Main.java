package Advanced_A6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static void usage(){
        System.err.println("error");
        System.exit(1);
    }

    public static void main(String[] args) {
        if(args.length != 1){
            usage();
        }

        Path file = Paths.get(args[0]);

        try{
            byte[] contents = Files.readAllBytes(file);
        } catch (IOException e) {
            System.err.println("error: " + e);
            System.exit(1);
        }
    }
}
