
/**
 * Demonstration of how to write a file using fileWriter
 *
 * @author  Bill Viggers
 * @version 7-Mar-2020
 */
import java.io.IOException; // handle errors
import java.io.File;  //  File handles
import java.io.FileWriter;  // to write the files

import java.util.Scanner; // to use scanner to read it back.


public class FileWriterExample
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class FileWriter
     */
    public FileWriterExample()
    {
        // initialise instance variables
        File file = new File ("writtenByMe.txt.");

        try {
            FileWriter writer = new FileWriter(file);                       
            writer.write("Whāia e koe te iti kahurangi;\n");
            writer.write("ki te tuohu koe, me maunga teitei");
            writer.flush();
            writer.close();
        } catch(IOException e) {};

        System.out.println("This is the readme");

        file=new File("README.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            } // while
        } catch(IOException e) {}; // try- catch

        System.out.println("And This is the file you wrote.");

        file=new File("writtenByMe.txt.");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            } // while

        
        } catch (IOException e){}; // try-catch
        
    }

 
}
