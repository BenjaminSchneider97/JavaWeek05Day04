package Intermediate_A4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    private static void usage(){
        System.err.println("Error you suck");
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            usage();
        }

        Path inputFile = Paths.get(args[0]);
        Path outputFile = Paths.get(args[1]);

        try {
            byte[] contents = Files.readAllBytes(inputFile);
            Files.write(outputFile, contents, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Error: " + e);
            System.exit(1);
        }
    }
}
