#include<stdio.h>

void StrCatX(char *src, char *dest)
{
    while(*src != '\0')
    {
        src++;
    }

    while(*dest != '\0')
    {
        *src = *dest;
        src++;
        dest++;
    }

    *src = '\0';
}

int main()
{
    char arr[30] = {'\0'};
    char brr[30] = {'\0'};

    printf("Enter first String :\n");
    scanf("%[^\n]s",arr);

    getchar();   // Clear Enter key

    printf("Enter second String :\n");
    scanf("%[^\n]s",brr);

    StrCatX(arr,brr);

    printf("Concatenated String : %s\n",arr);

    return 0;
}