
class Logic
{
    void findLargestDigit(int num)
    {
       int iCnt = 0;
       int iDigit = 0;

       while(num != 0)
       {
            iDigit = num % 10;

            if(iCnt < iDigit)
            {
                iCnt = iDigit;
            }

            num = num / 10;
       }

       System.out.println("Largest Didigt is :"+iCnt);

    }
}

class program94
{
    public static void main(String A []) 
    {
        Logic lobj = new Logic();
        lobj.findLargestDigit(83429);
    }
}