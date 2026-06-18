#include<stdio.h>
/*

    Enter number of rows
    3
    Enter number of Colunm
    5

    A       A       A       A       A
    B       B       B       B       B
    C       C       C       C       C

*/

void Pattern(int iRow, int iCol)
{
    int i = 0; int j = 0;
    char ch = '\0';

    for(i = 1,ch ='A'; i <= iRow; i++,ch++)
    {
        for(j = 1; j <= iCol; j++)
        {
            printf("%c\t",ch);
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