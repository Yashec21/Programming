#include<stdio.h>
/*
    Enter number of rows
    3
    Enter number of Colunm
    4
    1       2       3       4
    5       6       7       8
    9       10      11      12

*/

void Pattern(int iRow, int iCol)
{
    int i = 0; int j = 0;
    int iCnt = 0;

    for(i = 1; i <= iRow; i++)
    {
        iCnt = i;

        for(j = 1; j <= iCol; j++)
        {
            printf("%d\t",iCnt);
            iCnt++;
        }

        printf("\n");
       
    }

}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows\n");
    scanf("%d",&iValue1);

    printf("Enter number of Colunm\n");
    scanf("%d",&iValue2);

    Pattern(iValue1,iValue2);

    return 0;
}