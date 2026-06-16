import java.util.Scanner;

class NumberX
{
    public boolean  CheckPrime(int iNo)
    {
        int iCnt = 0;
        

        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                return false;  // Bad programming    beacuse after this lines are weastage 
            }                                        //cpu memory store this lines after running
        }

       
            return true; 
    }
}

class program67
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        bRet = nobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println("It is Prime");
        }
        else
        {
            System.out.println("It is not Prime");
        }
        
    }

}

//Time complexity = 0(N / 2)
// where          = N >= 0