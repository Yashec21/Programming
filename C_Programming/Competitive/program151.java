import java.util.*;

class StringX
{
    public String ConvertLower(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i]) >= 'A' && (Arr[i] <= 'Z'))
            {
                Arr[i] = (char)(Arr[i] + 32);
            }
        }

        String ret = new String(Arr);

        return ret;
    }
}

class program151
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        String data = null;

        System.out.println("Enter String");
        data = sobj.nextLine();

        StringX sxobj = new StringX();

        String Ret = null;

        Ret = sxobj.ConvertLower(data);

        System.out.println("Updated String is :"+Ret);


    }
}