#include <stdio.h>
typedef int BOOL;

#define TRUE 1
#define FALSE 0

typedef unsigned int UINT;

BOOL ChkBit (UINT iNo)
{
    while(iNo !=0)
    {
        UINT  iMask= 0x900;
        UINT Ans=0;
        Ans = iNo & iMask;

        if(Ans !=0)
        {
            return TRUE;
        }
        else
        {
            return FALSE;
        }
    }
}
int main()
{
    UINT iNo = 0; 
    BOOL bRet =FALSE;  

    printf("Enter number: ");
    scanf("%u", &iNo);

    bRet = ChkBit(iNo);
    if(bRet ==1)
    {
        printf("9 th and 12 th bit is on\n");
    }
    else
    {
        printf("9 th and 12 th bit is off\n");


    }
    return 0;
}