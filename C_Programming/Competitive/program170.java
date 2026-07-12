import java.util.*;

class CharacterX
{
   boolean CheckVowels( char cValue)
   {
        if(cValue == 'a' || cValue == 'e' || cValue == 'i' || cValue == 'o' || cValue == 'u' ||
            cValue == 'A' || cValue == 'E' || cValue == 'I' || cValue == 'O' || cValue == 'U')
        {
            return true;
        }
        else
        {
            return false;
        }
   }
}

class program170
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        char ch;
        boolean bRet = false;

        System.err.println("Enter the Character :");
        ch = sobj.next().charAt(0);

       CharacterX cobj = new CharacterX(); 

        bRet = cobj.CheckVowels(ch);

        if(bRet == true)
        {
            System.out.println("This character is Vowel");
        }
        else
        {
            System.out.println("This character not Vowel");
        }
    }
}