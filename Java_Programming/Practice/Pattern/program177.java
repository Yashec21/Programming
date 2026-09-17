//INPUT = 7
//OUTPUT= 1  *  2  *  3  *  4

import java.lang.*;
import java.util.Scanner;

class program177
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        int iCont = 0;

        for(iCnt = 1, iCont = 1; iCnt <= iNo; iCnt++)
        {
           if(iCnt % 2 == 0 )
           {
                System.out.print("*\t");
           }
           else
           {
                System.out.print(iCont+"\t");
                iCont++;
           }
           
    
        }

        System.out.println();
    }
    public static void main(String A []) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue= 0;

        System.out.println("Enter the number of elements :");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}