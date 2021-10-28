import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     array load from disk part 1
 * 
 *  Description:    load parallel arrays from a data file
 * 
 *************************************************************/

public class LoadParallelArraysFromDisk {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
        final int MAX = 100;        // array max size
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        BufferedReader fin = null;      // input buffer
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int n = 0;                      // actual size of arrays3
        
        // declare and allocate parallel arrays
        String[] names = new String[MAX];
        int[] list = new int[MAX];      
        double[] x = new double[MAX];
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        try{
            fin = new BufferedReader(new FileReader("recordData.txt"));
        }// end try
        catch(FileNotFoundException e){
            System.out.println("file not found");
            fin = null;
        }// end catch
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Load Parallel Arrays" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****

    // ***** Main Processing *****
    
        //pre-loop processing 
        n = 0;              // start indexing at 0
        
        strin = fin.readLine();
        
        while(strin != null){
            //System.out.println(strin);
            
            tokens = strin.split(delim);
            
            names[n] = tokens[0];
            list[n] = Integer.parseInt(tokens[1]);
            x[n] = Double.parseDouble(tokens[2]);
            n++;                    // increment record counter
            
            // update the loop
            strin = fin.readLine();
        }// end eod
    
    // ***** Print Formatted Output *****
    
        for(int i = 0; i < n; i++){
            System.out.print(names[i] + "\t");
            System.out.print(list[i] + ", ");
            System.out.print(x[i] + nl);

        }//end for
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
