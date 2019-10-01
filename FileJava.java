import java.io.IOException;
import java.util.Scanner;
import java.io.Writer;
import java.io.FileWriter;
 
public class FileJava {
    
    public static void main(String[] args)throws IOException {
    
    Scanner sc = new Scanner(System.in);
    String FileText;
    String text;
    
    System.out.println("Input File Text: ");
    FileText = sc.nextLine();
    
    System.out.println("Input File Name: ");
    text = sc.nextLine();
    
    FileWriter fw = new FileWriter(text+ ".txt");
    fw.write(FileText);
    fw.close();
    	
    }
}
