#include <stdio.h>
typedef unsigned int UINT;

UINT OnBit(UINT iNo)
{
    UINT iAns=0;
    UINT iMask =0x8;

    iAns = iNo | iMask;
   
    return iAns;
        
}
int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number: ");
    scanf("%u", &iValue);

    iRet = OnBit(iValue);

    printf("Modified number: %u\n", iRet);

    return 0;
}
