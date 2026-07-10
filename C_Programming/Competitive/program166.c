#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0x4000;
    UINT iAns = 0;
    
    iAns = iNo & iMask;

    if(iAns == iMask)
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
    UINT iValue = 0;
    BOOL iRet = 0;

    printf("Enter number :\n");
    scanf("%d",&iValue);

    iRet = ChkBit(iValue);

    if(iRet == TRUE)
    {
        printf("15th bit is no");
    }
    else
    {
        printf("15th bit is off");
    }

    return 0;
}