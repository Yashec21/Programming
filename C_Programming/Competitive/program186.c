#include <stdio.h>

typedef unsigned int UINT;

int CountONBits(UINT iNo)
{
    int iCount = 0;

    while(iNo != 0)
    {
        if((iNo & 1) == 1)
        {
            iCount++;
        }

        iNo = iNo >> 1;
    }

    return iCount;
}

int main()
{
    UINT iNo = 0;
    int iRet = 0;

    printf("Enter number: ");
    scanf("%u", &iNo);

    iRet = CountONBits(iNo);

    printf("Number of ON bits = %d\n", iRet);

    return 0;
}