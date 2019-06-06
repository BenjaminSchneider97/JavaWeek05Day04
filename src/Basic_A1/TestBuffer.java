package Basic_A1;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBuffer {

    public static void main(String args[]) throws IOException
    {
        // attach the file to FileInputStream
        FileInputStream fin = new FileInputStream("/home/judith/IdeaProjects/W5Day04_Java_IO/src/Basic_A1/file1.txt");

        BufferedInputStream bin = new BufferedInputStream(fin);

        // illustrating available method
        System.out.println("Number of remaining bytes:" +
                bin.available());

        // illustrating markSupported() and mark() method
        boolean b=bin.markSupported();
        if (b)
            bin.mark(bin.available());

        // illustrating skip method
        /*Original File content:
         * This is my first line
         * This is my second line*/
        bin.skip(10);
        System.out.println("FileContents :");

        // read characters from FileInputStream and
        // write them
        int ch;
        while ((ch=bin.read()) != -1)
            System.out.print((char)ch);
        System.out.println("----------");
        // illustrating reset() method
        bin.reset();
        while ((ch=bin.read()) != -1)
           System.out.print((char)ch);


        // close the file
        fin.close();
    }

}
