//Type 3

import java.util.Scanner;

class NumberX
{
    public void DisplayFactors(int iNo)
    {
        int icnt = 0;

        for(icnt =1; icnt < iNo; icnt++)
        {
            if((iNo % icnt) == 0)
            {
                System.out.println(icnt);
            }
        }
    }
}

class program46
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        nobj.DisplayFactors(iValue);
        
    }

}
