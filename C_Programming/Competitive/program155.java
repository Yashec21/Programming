import java.util.*;

class StringX
{
    public void  countSpace(String str)
    {
        char Arr[];
        int iCount = 0;
        int i = 0;

        Arr = str.toCharArray();

        for(iCount = 0; iCount < Arr.length; iCount++)
        {
            if(Arr[iCount] == ' ')
            {
                i++;
            }
        }

        System.out.println(i);
    }
}

class program155
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        String data = null;

        System.out.println("Enter String :");
        data = sobj.nextLine();

        StringX sxobj = new StringX();

        sxobj.countSpace(data);

    }
}