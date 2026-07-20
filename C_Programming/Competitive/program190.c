#include <stdio.h>

typedef unsigned int UINT;

UINT ToggalBitRange(UINT iNo, int iStart,int iEnd)
{
    UINT iMask =0;
    UINT iResult =0;

    int i=0;

    for(i = iStart ; i<=iEnd;i++)
    {
        iMask = (iMask | (1<<(i-1)));
    }
    iResult=iNo ^ iMask;
    return(iResult);
}
int main()
{
    UINT iValue = 0;
    int iStart = 0;
    int iEnd = 0;
    UINT iRet=0;


    printf("Enter number: ");
    scanf("%u", &iValue);

    printf("Enter starting : ");
    scanf("%d", &iStart);
    
    printf("Enter ending : ");
    scanf("%d", &iEnd);


    iRet =ToggalBitRange(iValue,iStart,iEnd);

    printf("Updated number is : %u",iRet);

    

    return 0;
}