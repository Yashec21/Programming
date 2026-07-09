import java.util.*;

class StringX
{
    public String StrRevX(String str)
    {
        char Arr[];

        Arr = str.toCharArray();

        int start = 0;
        int end = Arr.length -1;
        char temp;

        while(start < end)
        {
            temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;

            start++;
            end--;
        }

        return new String(Arr);

    }
}

class program160
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        String data = null;

        System.out.println("Enter String :");
        data = sobj.nextLine();

        StringX sxobj = new StringX();

        String iRet = null;

        iRet = sxobj.StrRevX(data);

        System.out.println("Modified string is :"+iRet);
    }
}