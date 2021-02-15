//************************************************************
//  Author: Steven Smail
//
//  IntAve.java
//
//  This program reads a text file consisting of integer
//  values and computes the average of the values.//************************************************************

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class IntAve{    public static void main (String[] args)
        throws FileNotFoundException    {
        int n, total = 0, count = 0;
        double average;

        System.out.println();
        System.out.println("This is program IntAve");

        System.out.println();
        System.out.print("Please enter file name: ");
        Scanner keyboardScanner = new Scanner(System.in);
        String filename = keyboardScanner.nextLine();

        try
        {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            System.out.println();
            while (fileScanner.hasNext()) //Test for end of file            {                n = fileScanner.nextInt();
                total += n;
                count++;
            }

            average = (double) total / count;

            System.out.println("The average is " + average);
        }

        catch (FileNotFoundException ex)        {
            System.out.println("File " + filename + 
                               " was not found");        }
        System.out.println();
        System.out.println("Program complete");
        System.out.println();
    }
}