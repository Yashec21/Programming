#include<stdio.h>

int main()
{
    unsigned int iNo = 0;
    unsigned int iMask = 4;   //3rd bit ahe manun 4 lihila ahe ,pahili asali asti tr 2 ala asta 
    unsigned int iAns = 0;

    printf("Enter Number :\n");
    scanf("%d",&iNo);

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            printf("3rd bit is ON\n");
        }
        else
        {
            printf("3rd bit is OFF\n");
        }

    return 0;

}
