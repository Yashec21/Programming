import java.util.*;

class program16
{
    public static void main (String A [])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        int iMax = 0;
        String temp = null;

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() > iMax)
            {
                iMax = Tokens[i].length();
                temp = Tokens[i];
            }
        }

        System.out.println("Max length of token is :"+ temp + " length is :"+iMax);
    }
}