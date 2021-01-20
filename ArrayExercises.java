import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Array Exercises
 * 
 *  Description:    basic array operations
 * 
 *************************************************************/

public class ArrayExercises {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
        final int MAX = 20;         // set the maximum size of the array to 20
        
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        // *** array exercise variables
        
        int[] list = new int[MAX];      // declare and allocate an int array of max size 20
        int n = 0;                      // get the actual size from the keyboard
        int np = 0;                     // number to print
        
    // ***** objects *****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Array Exercises" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
    // *** Q1 ***
        // load 5 numbers into the array
        // for(int i = 0; i < 5; i++){
            // System.out.println("enter number " + (i + 1));
            // list[i] = scanner.nextInt();
        // }// end for loop to load array
        
        // print the array
        // for(int i = 0; i < 5; i++)
            // System.out.println((i + 1) + ": " + list[i]);
            
        // for(int i = MAX - 1; i >= 0; i--)
            // System.out.println(i);
            
        // *** Q2 ***
        System.out.println("how many numbers do you want to enter?");
        n = scanner.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter number " + (i + 1) + ".");
            list[i] = scanner.nextInt();
        }
    
        // print the array
        for(int i = 0; i < n; i++)
            System.out.println((i + 1) + ": " + list[i]);
            
        // *** Q3 ***&
        System.out.println("which number would you like to print?");
        np = scanner.nextInt();
        System.out.println(list[np - 1]);
            
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
