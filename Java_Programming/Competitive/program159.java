import java.util.*;

class StringX
{
    public int LastChar(String str , char ch)
    {
        char Arr[];

        Arr = str.toCharArray();
        int i = 0;

        for(i = Arr.length -1; i >= 0; i--)
        {
            if(Arr[i] == ch)
            {
                return i;
            }
            
        }

        return -1;
    }
}

class program159
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

        iRet = sxobj.LastChar(data, ch);

        System.out.println("Character frequency is :"+iRet);
    }
}