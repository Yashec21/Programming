
class Logic
{
    void printEvenNumber(int iNo)
    {
      int iCnt = 0;

      for(iCnt = 0; iCnt <= iNo; iCnt++)
      {
        if(iCnt % 2 == 0)
        {
          System.out.println(iCnt);
        }
      }
    }
}

class program82
{
    public static void main(String A []) 
    {
        Logic lobj = new Logic();
        lobj.printEvenNumber(20);
    }
    
}
