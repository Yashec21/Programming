#include<stdio.h>
/*

    Enter number of rows
    4
    Enter number of Colunm
    4

    A       B       C       D
    A       B       C       D
    A       B       C       D
    A       B       C       D
        

*/

void Pattern(int iRow, int iCol)
{
    int i = 0; int j = 0;
    char ch = '\0';

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1,ch ='A'; j <= iCol; j++,ch++)
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