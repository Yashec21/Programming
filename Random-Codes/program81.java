import java.util.*;

class program11 
{

    public static boolean  ChkPrime(int iNo)
    {
        int i = 0;
        boolean bFlag = false;

        for( i = 2; i < (iNo / 2); i++)
        {
            if(iNo % i == 0)
            {
                return bFlag;
            }
        }

        bFlag = true;
        return bFlag;
    }

    public static void main( String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean iRet = false;

        System.out.println("Enter the number that you want to check :");
        iValue = sobj.nextInt();

        iRet = ChkPrime(iValue);

        if(iRet == true)
        {
            System.out.println("It is prime number ");
        }
        else
        {
            System.out.println("It is not prime number ");
        }
        
    }    
}
