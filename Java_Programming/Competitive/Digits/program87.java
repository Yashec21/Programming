
class Logic
{
    void DisplayGrade(int marks)
    {
        if(marks <= 100 && marks >= 91)
        {
            System.out.println("Gread is A");
        }
        else if(marks <= 90 && marks >= 81)
        {
            System.out.println("Gread is B");
        }
        else if(marks <= 80 && marks >= 71)
        {
            System.out.println("Gread is C");
        }
        else if(marks <= 70 && marks >= 61)
        {
            System.out.println("Gread is D");
        }
        else
        {
            System.out.println("Gread is F");
        }
    }
}

class program87
{
    public static void main(String A []) 
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }
    
}
