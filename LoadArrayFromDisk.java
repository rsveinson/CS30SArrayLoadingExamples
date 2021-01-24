import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     loading arrays from data files
 * 
 *  Description:    looking at the basic array funtions
 * 
 *************************************************************/

public class LoadArrayFromDisk {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
        final int MAX = 400;        // max 400 elements in the arry
        
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int[] list = new int[MAX];      // declare and allocate an arry
        int n = 0;                      // actual number of elements in array
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = new BufferedReader(new FileReader("arraySimpleData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("arrayOut.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Ax Qy" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        fout.print(banner);
    
    // ***** Get Input *****
    
    // ***** Main Processing *****
        
    // since the data is arranged 1 to a line we don't need split or tokens
        // strin = fin.readLine();
        
        // while(strin != null){
            // System.out.println(strin);
            
            // // parse input to int and insert it into the array at index n
            // list[n] = Integer.parseInt(strin);
            // n++;                                // don't forget to increment n
            
            // // updat the loop
            // strin = fin.readLine();
        // }
    
    // this time stop loading when the first 0 is encountered
    // or at eof
    
        strin = fin.readLine();
        
        while(strin != null && strin.charAt(0) != '0'){
            
            // parse and insert, increment n to keep count of the actual number of elements
            list[n] = Integer.parseInt(strin);
            n++;
            
            // updat the loop
            strin = fin.readLine();           
        }
    
    // ***** Print Formatted Output *****
    
        for(int i = 0; i < n; i++){
            System.out.println(i + ": " + list[i]);
            fout.println(i + ": " + list[i]);
        }//end for int i
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        fin.close();
        fout.close();
    } // end main 
    
} // end FormatTemplate
