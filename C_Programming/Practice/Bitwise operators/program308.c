#include<stdio.h>

int main()
{
    int iNo = 0;
    int iMask = 4;   //3rd bit ahe manun 4 lihila ahe ,pahili asali asti tr 2 ala asta 
    int iAns = 0;

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
