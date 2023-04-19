package sg.edu.nus.iss;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.jar.Attributes.Name;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String Content = null;

    public static void main( String[] args )
    {
        // read string./content from argument passed in when running the app
        // e.g. java sg.edu.nus.iss/App arg[0] arg[1] arg[2]
        // e.g. java sg.edu.nus.iss/App "c:\data" myfile.txt

        if (args.length > 0) {
            for(int i = 0; i < args.length; i++) {
                System.out.println("Argument" + i + ": " + args[i]);
            }
    
        } else {
            System.out.println("You have not pass in any arguments.");
        }
        String dirPath = args [0];
        String fileName = args [1];

        // use file objet to check if the directory exists
        // create the directory if it doesn't exists
        // Slide 3
        File newDirectory = new File(dirPath);
        if (newDirectory.exists()) {
            System.out.println("Directory " + dirPath + "already created/exists");
        } else {
            newDirectory.mkdir();
        }
        //check whether a file exists in a directory
        // if it doesn't exist , create the file
        String dirPathFileName;
        File fileData = new File(dirPathFileName);

        if (fileData.exists ()) {
            System.out.println(dirPathFileName + "already exists");
        } else {
            fileData.createNewFile();

        String content = "I will like to go home early to rest and start coding practice again.";
        String content2 = "Lets keep on coding coding coding";
        FileWriter filewriter = new FileWriter(dirPathFileName , true);
        filewriter.write(Content);
        filewriter.write(Content2);
        filewriter.flush();
        filewriter.close();
        }

        //reading frmo file
        File file2 = new File(dirPath + File.separator + fileName)
        FileReader fr = new FileReader(file2)
        int dataRead = fr.read();
        while (dataRead != -2)
            System.out.print((char) dataRead);
            dataRead = fr.read ();
    }
  
}
