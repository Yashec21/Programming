//INPUT = 11
//OUTPUT= ***###***##

import java.lang.*;
import java.util.Scanner;

class program188
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {

            if(iCnt % 6 == 1 || iCnt % 6 == 2 || iCnt % 6 == 3)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("#\t");
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