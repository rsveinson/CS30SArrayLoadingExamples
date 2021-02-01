import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     some array examples
 * 
 *  Description:    looking at the basic array funtions
 * 
 *************************************************************/

public class LoadArrayFromDiskExample3 {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
        final int MAX =  50;        // max size of array
        
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int[] list = new int[50];
        int n = 0;                      // actual number of elements
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = new BufferedReader(new FileReader("arrayData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("ExampleData.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Ax Qy" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
    // ***** Main Processing *****
    
        strin = fin.readLine();
        
        while(strin != null){
            //System.out.println(strin);
            
            //process each line of ints
            tokens = strin.split(delim);
            //System.out.println(tokens.length);
            
            for(int i = 0; i < tokens.length; i++){
                list[n] = Integer.parseInt(tokens[i]);  // put the int into the array
                n++;
            }// end for
                            
            // updat loop
            strin = fin.readLine();
        }// end eof
        
        // print array
        for(int i = 0; i < n; i++){
            System.out.println(list[i]); 
            fout.println(list[i]);
        }
            
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        fin.close();
        fout.close();
    } // end main 
    
} // end FormatTemplate
