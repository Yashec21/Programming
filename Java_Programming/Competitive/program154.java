import java.util.*;

class StringX
{
    public void  Digit(String str)
    {
        char Arr[];

        int i = 0;

        Arr = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= '0' && Arr[i] <= '9')
            {
                System.out.println(Arr[i]);
            }
        }
    }
}

class program154
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        String data = null;

        System.out.println("Enter String :");
        data = sobj.nextLine();

        StringX sxobj = new StringX();

        sxobj.Digit(data);

    }
}