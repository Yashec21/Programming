#include<stdio.h>
/*
    EEnter number of rows
    4
    Enter number of Colunm
    4
    2       4       6       8       10
    1       3       5       7       9
    2       4       6       8       10
    1       3       5       7       9

*/

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0;
    int iCnt = 0;

    for(i = 1; i <= iRow; i++)
    {
        if(i % 2 != 0)
        {
            iCnt = 2;
        }
        else
        {
            iCnt = 1;
        }

        for(j = 0; j <= iCol; j++)
        {
            printf("%d\t", iCnt);
            iCnt = iCnt + 2;
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