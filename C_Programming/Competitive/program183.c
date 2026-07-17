#include <stdio.h>

typedef unsigned int UNIT;


UNIT OnBit(UNIT iNo,UNIT iPos)
{
    UNIT iAns=0;
    UNIT iMask =0x1;

    iMask = iMask <<(iPos-1);
    iAns = iNo | iMask ;
    
    
    return iAns;
    


        
}
int main()
{
    UNIT iNo=0;
    UNIT iPos=0;

    UNIT iRet =0;

    printf("Enter number \n");
    scanf("%d",&iNo);

    printf("Enter position \n");
    scanf("%d",&iPos);

    iRet = OnBit(iNo,iPos);

    printf("%u",iRet);
}
