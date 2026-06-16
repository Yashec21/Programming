import java.util.*;

class DigitX
{
    public int SumDigits(int iNo)
    {
        
        int iSum = 0;


        while(iNo != 0)
        { 
            iSum = iSum + (iNo % 10);
            iNo = iNo / 10;
        }

        return  iSum; 
    }

}

class program90
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        iRet = dobj.SumDigits(iValue);   //we are callthe function with the object of class of this function

        System.out.println("Summetion of digit is :"+iRet);

    }
}