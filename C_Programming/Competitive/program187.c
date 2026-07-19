#include <stdio.h>

typedef unsigned int UINT;

void CommanONBits(UINT iNo1, UINT iNo2)
{
    UINT iResult = iNo1 & iNo2;
    int iPos = 1;

    while(iResult != 0)
    {
        if((iResult & 1) == 1)
        {
            printf("%d ", iPos);
        }

        iResult = iResult >> 1;
        iPos++;
    }
}
int main()
{
    UINT iNo1 = 0;
    UINT iNo2 = 0;

    printf("Enter number: ");
    scanf("%u", &iNo1);

    printf("Enter number: ");
    scanf("%u", &iNo2);


    CommanONBits(iNo1,iNo2);

    

    return 0;
}