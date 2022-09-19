/******************************************************************************
Eric Zhang
AP Comp Sci 
9/16/2020
Rectangle program
*******************************************************************************/
import java.io.*;
public class Main
{
    
        public static void main(String[] args) throws IOException
        {
            DataInputStream reader = new DataInputStream(System.in);
            int length;
            int width;
            int perim;
            String userInput;
            String done = "Y";
            while((done.equals ("y")) || (done.equals ("Y")))
            {
                System.out.print("Enter the length of your rectangle: ");
                userInput = reader.readLine();
                length=Integer.parseInt (userInput);
                System.out.print("\nEnter the width of your rectangle: ");
                userInput = reader.readLine();
                width=Integer.parseInt (userInput);
                perim = width * 2 + length *2;
                System.out.print("\nThe perimeter of the rectangle with a width " + width + " and length " +length + " is " +perim + ".\n");
                System.out.println("\nThe area of the rectangle with a width " + width + " and length " +length + " is " + (width * length) + ".\n");
                if ((perim >= 25) && (perim < 51))
                {
                    System.out.print("Your perimeter is from 25 - 50.\n");
                }
                else if(perim <=24)
                {
                    System.out.print("Your perimeter is less than 25.\n");
                }
                else
                {
                    System.out.print("Your perimeter is over 50.\n");
                }
                System.out.print("Do you want to run this program again?");
                done = reader.readLine();
            }
               
            
            
        }
}