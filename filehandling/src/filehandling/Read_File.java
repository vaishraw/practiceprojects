package filehandling;
import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 

public class Read_File {
	 
	  public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> l = Collections.emptyList(); 
	    try
	    { 
	      l = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return l; 
	  } 
	  public static void main(String[] args) 
	  { 
	    List l1 = readFileInList("G:\\test\\myfile1.txt"); 
	  
	    Iterator<String> i = l1.iterator(); 
	    while (i.hasNext()) 
	      System.out.println(i.next()); 
	  } 
	}


