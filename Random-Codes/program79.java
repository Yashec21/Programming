import java.util.*;

class NumberX
{
    static int iSum = 0;

    public int Number(int iNo)
    {
        if(iNo != 0)
        {
            iSum = iSum + iNo;
            iNo--;

            Number(iNo);
        }

        return iSum;
    }
}

class program9
{
    public static void main( String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        iRet = nobj.Number(iValue);
        System.out.println(iRet);
    }
}
