import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     loading an arry from a data file using
 *                  a sentinel loop
 * 
 *  Description:    sentinal loop loading, continue loading ints until
 *                  some specified value is encountered
 *                  In this case we'll load until we read a 0
 * 
 *************************************************************/

public class LoadArrayFromSentinalLoop {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
        final int MAX = 200;        // max size of array
        
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int[] list  = new int[MAX];
        int n = 0;                   // actual size of the array
        int sum = 0;
        
        int evenCount = 0;
        int oddCount = 0;
        
        int evenSum = 0;
        int oddSum = 0;
        
        //System.out.println(list);
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = new BufferedReader(new FileReader("arraySimpleData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("EofArrayOut.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Loading from disk example" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        fout.print(banner);
    
    // ***** Get Input *****    
    // ***** Main Processing *****
    
        // pre-loop processing
        
        n = 0;              // set element counter to 0
        
        strin = fin.readLine();
        list[n] = Integer.parseInt(strin);
        
        while(strin != null && list[n] != 100){
            //System.out.println(strin);
            
            n++;        // increment element counter
            
            // update loop
            strin = fin.readLine();
            list[n] = Integer.parseInt(strin);
        }//end eof loop
    
        // sum the elements of the array
        for(int i = 0; i < n; i++){
            sum += list[i];
        }// end for int i
        
        // add and count odd and even numbers
        for(int i = 0; i < n; i++){
            if(list[i] % 2 == 0){
                evenCount++;
                evenSum += list[i];
            }// end even
            else{
                oddCount++;
                oddSum += list[i];
            }// end odd
        }// end add and count odd and even
        
    // ***** Print Formatted Output *****
    
        for(int i = 0; i < n; i++){
            System.out.println(i + ": " + list[i]);
            fout.println(i + ": " + list[i]);
        }// end for int i
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        fout.println("End of Processing");
        
    // **** close io buffers *****
    
        fin.close();
        fout.close();
    } // end main 
    
} // end FormatTemplate
