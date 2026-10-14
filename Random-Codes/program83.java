import java.util.*;

class StringX
{
    public void CharDisplay( String Arr)
    {
        char Brr[] = Arr.toCharArray();

        int i = 0;

        for(i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }

        System.out.println("String length is :" + Brr.length);
    }
}

class program13
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);
        
        String Str;

        System.out.println("Enter the string :");
        Str = sobj.nextLine();
        
        StringX ssobj = new StringX();

        ssobj.CharDisplay(Str);
    }
}