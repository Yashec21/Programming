import java.util.*;

class StringX
{
    public String toToggle( String str)
    {
        char Arr[];
        int i = 0;

        Arr = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Arr[i] = (char)(Arr[i] + 32);
            }

            else if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                 Arr[i] = (char)(Arr[i] - 32);
            }
            
        }

        String Ret = new String(Arr);

        return Ret;

    }
}

class program153
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        String data = null;

        System.out.println("Enter String :");
        data = sobj.nextLine();

        StringX sxobj = new StringX();

        String Result = null;

        Result = sxobj.toToggle(data);

        System.out.println("Updated String is :"+Result);

    }
}