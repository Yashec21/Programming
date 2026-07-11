import java.util.*;

class NumberX
{
    void DisplayConvert(char cValue)
    {
        if(cValue >= 'a' && cValue <= 'z' )
        {
            cValue = (char)(cValue - 32);
            System.out.println(cValue);
        }
        else if(cValue >= 'A' && cValue <='Z')
        {
            cValue = (char)(cValue + 32);
            System.out.println(cValue);

        }
    }
}

class program169
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        char ch;

        System.err.println("Enter the Character :");
        ch = sobj.next().charAt(0);

        NumberX nobj = new NumberX();

        nobj.DisplayConvert(ch);
    }
}