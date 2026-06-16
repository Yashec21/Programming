
class Logic
{
    void findSmallestDigit(int num)
    {
       int iCnt = 9;
       int iDigit = 0;

       while(num != 0)
       {
            iDigit = num % 10;

            if(iCnt > iDigit)
            {
                iCnt = iDigit;
            }

            num = num / 10;
       }

       System.out.println("Smallest Didigt is :"+iCnt);

    }
}

class program95
{
    public static void main(String A []) 
    {
        Logic lobj = new Logic();
        lobj.findSmallestDigit(45872);
    }
}