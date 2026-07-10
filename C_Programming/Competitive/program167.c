#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    
}

int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter the Number :\n");
    scanf("%d",&iValue);

    bRet = ChkBit(iValue);

    return 0;
}