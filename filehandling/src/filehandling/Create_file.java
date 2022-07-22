package filehandling;
import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
/*import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;*/


	public class Create_file
	{
	    public static void main(String[] args) throws IOException
	    {
	        createFileUsingFileClass();
	        //createFileUsingFileOutputStreamClass();
	        //createFileIn_NIO();
	    }
	    private static void createFileUsingFileClass() throws IOException
	    {
	          File f = new File("G:\\test\\myfile1.txt");
	  
	          
	          if (f.createNewFile()){
	            System.out.println("File created!");
	          }else{
	            System.out.println("File already exists.");
	          }
	           
	          
	          FileWriter w = new FileWriter(f);
	          w.write("This is TestFile.");
	          w.close();
	          System.out.println("Successfully wrote to the file.");
	    }
	 
	    /*private static void createFileUsingFileOutputStreamClass() throws IOException
	    {
	        String data = "This is TestFile 1";
	        FileOutputStream out = new FileOutputStream("G:\\test\\testfile1.txt");
	        out.write(data.getBytes());
	        out.close();
	    }
	 
	    private static void createFileIn_NIO()  throws IOException
	    {
	        String data = "THis is TestFile 2";
	        Files.write(Paths.get("G:\\test\\testFile2.txt"), data.getBytes());
	        List<String> lines = Arrays.asList("1st line", "2nd line");
	       Files.write(Paths.get("file6.txt"),
	                    lines,
	                    StandardCharsets.UTF_8,
	                    StandardOpenOption.CREATE,
	                    StandardOpenOption.APPEND);
	    }
	}*/

	 
	}


