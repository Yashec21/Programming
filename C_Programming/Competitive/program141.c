/*
#include<stdio.h>

void DisplayASCII()
{
    char ch = '\0';

    for(ch = 0; ch <= 127; ch++)
    {
        printf("%c",ch);
    }
}

int main()
{
    DisplayASCII();

    return 0;
}

*/

/*
#include <stdio.h>

void DisplayASCII()
{
    int i = 0;

    printf("-------------------------------------------------\n");
    printf("Decimal\tCharacter\tOctal\tHexadecimal\n");
    printf("-------------------------------------------------\n");

    for(i = 0; i <= 255; i++)
    {
        printf("%d\t%c\t\t%o\t%X\n", i, i, i, i);
    }
}

int main()
{
    DisplayASCII();

    return 0;
}

*/

#include <stdio.h>

void DisplayASCII()
{
    int i = 0;

    printf("--------------------------------------------------------\n");
    printf("Symbol\tDecimal\tOctal\tHexadecimal\n");
    printf("--------------------------------------------------------\n");

    for(i = 0; i <= 255; i++)
    {
        printf("%c\t%d\t%o\t%X\n", (unsigned char)i, i, i, i);
    }
}

int main()
{
    DisplayASCII();

    return 0;
}