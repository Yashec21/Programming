#include<stdio.h>
/*
    Enter number of rows
    5
    Enter number of Colunm
    5
    1        2       3       4       5       
    -1      -2      -3      -4      -5
    1        2       3       4       5       
    -1      -2      -3      -4      -5
    1        2       3       4       5  

*/

void Pattern(int iRow, int iCol)
{
    int i = 0;
    int j = 0;
    int iCount = -1;

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1,iCount = -1; j <= iCol; j++,iCount--)
        {
            if(i % 2 != 0)
            {
                printf("%d\t"" ",j);
            }
            else
            {
                printf("%d\t",iCount);
            }

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