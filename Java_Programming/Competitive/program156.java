import java.util.*;

class StringX
{
    public boolean ChkChar(String str , char ch)
    {
        char Arr[];
        int i = 0;

        Arr = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch)
            {
                return true;
            }
        }

        return false;

    }
}

class program156
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        String data = null;
        char ch ;

        System.out.println("Enter String :");
        data = sobj.nextLine();

        System.out.println("Enter Character :");
        ch = sobj.next().charAt(0);

        StringX sxobj = new StringX();

        boolean bRet = false;

        bRet = sxobj.ChkChar(data, ch);

        if(bRet == true)
        {
            System.out.println("Character found");
        }
        else
        {
            System.out.println("Character not found");
        }
    }
}