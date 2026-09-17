//INPUT = 7
//OUTPUT= A   2   C   4   E   6   G

import java.lang.*;
import java.util.Scanner;

class program191
{
    public static void Display()
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= 4; i++)
        {
            for(j = 0; j <= 4; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

        
    }
    public static void main(String A []) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue= 0;

        // System.out.println("Enter the number of elements :");
        //iValue = sobj.nextInt();

        Display();
    }
}