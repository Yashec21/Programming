import java.util.*;

class NumberX
{
    void printEvenFactor(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0 && iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program168
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.err.println("Enter the number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        nobj.printEvenFactor(iValue);
        
    }
}