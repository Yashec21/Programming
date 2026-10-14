import java.util.*;

class Ticket
{
    public void chkAge(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo > 1 && iNo <= 5)
        {
            System.out.println("Ticket prize : 0");
        }
        else if(iNo >= 6 && iNo <= 18)
        {
            System.out.println("Ticket prize : 500");
        }
        else if(iNo > 19 && iNo <= 50)
        {
            System.out.println("Ticket prize : 900");
        }
        else if(iNo == 0)
        {
            System.out.println("Invalid age :");
        }
        else 
        {
            System.out.println("Ticket prize : 400");
        }
    }
}

class program6
{
    public static void main( String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the age :");
        iValue = sobj.nextInt();

        Ticket tobj = new Ticket();

        tobj.chkAge(iValue);
    }
}
