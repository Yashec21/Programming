//Type 3

import java.util.Scanner;

class NumberX
{
    public void DisplayFactors(int iNo)
    {
        int icnt = 0;

        for(icnt =1; icnt <= (iNo / 2); icnt++)
        {
            if((iNo % icnt) == 0)
            {
                System.out.println(icnt);
            }
        }
    }
}

class program47
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

//Time complexity = 0(N / 2)
// where          = N >= 0