import java.util.Scanner;

class StringX
{
    public String UpperCase(String str)
    {
        int i = 0;

        char brr[] = str.toCharArray();

        for(i = 0; i < brr.length; i++)
        {
            if(brr[i] >= 'a' && brr[i] <= 'z')
            {
                brr[i] = (char) (brr[i] - 32);
            }
        }

        String newStr = new String(brr);

        return newStr;
    }
}

class program8
{
    public static void main( String A [])
    {
        Scanner sobj = new Scanner(System.in);

        String bRet;

        String Arr;

        System.out.println("Enter the string :");
        Arr = sobj.nextLine();

        StringX ssobj = new StringX();

        bRet = ssobj.UpperCase(Arr);
        System.out.println(bRet);
    }
}
