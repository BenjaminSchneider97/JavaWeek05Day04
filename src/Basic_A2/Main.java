package Basic_A2;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    private static void usage() {
        System.err.println("Error: <file> as an argument is needed!");

        System.exit(1);
    }

    public static void main(String[] args) {

        if(args.length != 1){
            usage();
        }

        Path path = Paths.get(args[0]);

        try{
            byte[] content = Files.readAllBytes(path);

            for(int i = 0; i < content.length; i++){
                System.out.print((char) content[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}

//java Main.java text.txt