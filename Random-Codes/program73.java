import java.util.*;

class Display
{
    void Display(int brr[] , int iSize)
    {
        int i = 0;

        System.out.println("Elemets in array are :");

        for(i = 0; i < iSize; i++)
        {
            System.out.println(brr[i]);
        }
    }
}

class program3
{
    public static void main(String A [] ) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int i = 0;

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        int arr[];

        arr = new int[iValue];

        System.out.println("Enter elements :");
        for(i = 0; i < iValue; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Display dobj = new Display();

        dobj.Display(arr, iValue);
    }
}