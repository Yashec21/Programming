import java.util.*;

class NumberX
{
    boolean DigitChk(int iNo)
    {
        boolean bFlag = false;

        if(iNo % 3 == 0 && iNo % 5 == 0)
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program2
{
    public static void main(String A [] ) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        bRet = nobj.DigitChk(iValue);

        if(bRet == true)
        {
            System.out.println("This number is divisible by 3 and 5 ");
        }
        else
        {
            System.out.println("This number can not divisible by 3 and 5");
        }
    }
}