#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0X1000;  
    UINT iAns = 0;

    printf("Enter Number :\n");
    scanf("%d",&iNo);

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            printf("13th bit is ON\n");
        }
        else
        {
            printf("13th bit is OFF\n");
        }

    return 0;

}
