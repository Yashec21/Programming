import java.util.*;

class DisplatArr
{
    void Display(double arr[], int iSize)
    {
        int i = 0;

        System.out.println("Elemets in array are :");
        for(i = 0; i < iSize; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

class program4
{
    public static void main(String A [] ) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int i = 0;

        System.out.println("Enter the number :");
        iValue = sobj.nextInt();

        double drr[];

        drr = new double[iValue];

        System.out.println("Enter the elemets :");

        for(i = 0; i < iValue; i++)
        {
            drr[i] = sobj.nextDouble();
        }

        DisplatArr dobj = new DisplatArr();

        dobj.Display(drr, iValue);
    }
}