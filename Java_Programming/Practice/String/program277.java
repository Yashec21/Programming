import Marvellous.StringX;
import java.util.*;

class program277
{
    public static void main(String A []) 
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;

        program280 strobj = new program280();          
        int iRet = 0;

        System.out.println("Enter String :");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);
        System.out.println("Number of Capital characters : "+iRet);
       
        iRet = strobj.CountSmall(data);
        System.out.println("Number of Small characters : "+iRet);

        iRet = strobj.CountDigits(data);
        System.out.println("Number of digits are : "+iRet);

        
        iRet = strobj.CountSpace(data);
        System.out.println("Number of Space are : "+iRet);

        iRet = strobj.CountSpecial(data);
        System.out.println("Number of Special symbols are : "+iRet);

    }
}