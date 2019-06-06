package Advanced_A7;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("./src/Advanced_A6/lorem.txt");

        long size = file.length();

        System.out.println("The file has: " + size + " bytes!");
        System.out.println("The file has: " + calcKiloBytes(file) + " kilobytes!");
        System.out.println("The file has: " + calcMegaBytes(file) + " megabytes!");
    }

    private static double calcKiloBytes(File file){
        return (double) file.length() / 1024;
    }

    private static double calcMegaBytes(File file){
        return (double) file.length() / (1024*1024);
    }
}
