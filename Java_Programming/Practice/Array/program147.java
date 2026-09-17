import java.util.*;
class ArrayX
{
      public  void Update(int Arr[])
      {
            int iCnt = 0;

            for(iCnt = 0; iCnt < Arr.length; iCnt++)
            {
                  Arr[iCnt]++;
            }
      }
}


class program147
{
      public static void main(String A []) 
      {
          Scanner sobj = new Scanner(System.in);

          int Brr[] = {10,20,30,40,50};

          System.out.println("Array befor function call :");

          int iCnt = 0;

          for(iCnt = 0; iCnt < Brr.length; iCnt++)
          {
            System.out.println(Brr[iCnt]);
          }

            ArrayX aobj = new ArrayX(); //we create obj because function is non satic 
            aobj.Update(Brr);

             for(iCnt = 0; iCnt < Brr.length; iCnt++)
          {
            System.out.println(Brr[iCnt]);
          }


        

      }
}