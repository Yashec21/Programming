#include <stdio.h>
typedef int BOOL;
typedef unsigned int UNIT;

# define TRUE 1
# define FALSE 0

BOOL ChkBit(UNIT iNo,UNIT iPos)
{
    UNIT iAns=0;
    UNIT iMask =0x1;

    iMask = iMask <<(iPos-1);
    iAns = iNo & iMask;
    if(iAns== iMask)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }


        
}
int main()
{
    UNIT iNo=0;
    UNIT iPos=0;

    UNIT bRet =0;

    printf("Enter number \n");
    scanf("%d",&iNo);

    printf("Enter position \n");
    scanf("%d",&iPos);

    bRet = ChkBit(iNo,iPos);

    if(bRet == TRUE)
    {
        printf("TRUE");
    }
    else
    {
        printf("FALSE");
    }
}
