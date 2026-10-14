class node
{
    public int data;
    public node next;
    public node prev;

    public node(int iNo)
    {
        this.data = iNo;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCL
{
    private node first;
    private int iCount;
    private node last;

    public DoublyCL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = first;

        if(first == null)
        {
            return;
        }

        do
        {
            System.out.print("| "+temp.data+" | <=> " );
            temp = temp.next;

        }while(temp != first);

        System.out.println();
    }

    public int Count()
    {
        return  this.iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn = null;

        newn = new node(iNo);

        if(first == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            first.prev = newn;
            newn.next = first;
            first = newn;
        }

        first.prev = last;
        last.next = first;

        iCount++;
    }
}


class program10
{
    public static void main(String A [] ) 
    {
        DoublyCL dobj = new DoublyCL();

        int iRet = 0;

        dobj.InsertFirst(11);
        dobj.InsertFirst(21);
        dobj.InsertFirst(51);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of nodes are :"+iRet);
    }
}