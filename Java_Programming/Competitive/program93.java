
class Logic
{
    void CheckPerfect(int n)
    {
       int iCnt = 0;
       int iSum = 0;
        
       for(iCnt = 1; iCnt < n; iCnt++)
       {
            if(n % iCnt == 0)
            {
               iSum = iCnt + iSum;
            }
        
       }
       if(n == iSum)
       {
            System.err.println(iSum+" is perfect number");
       }
       else
        {
            System.out.println("it is not perfect number");
        }
       
    }
}


class program93
{
    public static void main(String A []) 
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(27);
    }
}