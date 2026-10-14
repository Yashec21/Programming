
class node
{
    public int data;
    public node next;   

    public node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL
{
    private node first;
    private int iCount;

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public int Count()
    {
        return  iCount;
    }
    
    public void Display()
    {
        node temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" | -> " );
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void InsertFirst(int  iNo)
    {
        node newn = new node(iNo);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }

        iCount++;
    }
}

class program5
{
    public static void main(String A [] ) 
    {
        int iRet = 0;
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are :"+iRet);
    }
}