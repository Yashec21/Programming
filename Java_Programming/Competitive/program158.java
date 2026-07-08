import java.util.*;

class StringX
{
    public int countChar(String str , char ch)
    {
        char Arr[];

        Arr = str.toCharArray();
        int i = 0, iCount = -1;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch)
            {
                return  i;
            }
        }

        return iCount;
    }
}

class program158
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        String data = null;

        System.out.println("Enter String :");
        data = sobj.nextLine();

        char ch;

        System.out.println("Enter the Character");
        ch = sobj.next().charAt(0);

        StringX sxobj = new StringX();

        int iRet = 0;

        iRet = sxobj.countChar(data, ch);

        System.out.println("Character frequency is :"+iRet);
    }
}