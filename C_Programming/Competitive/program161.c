#include<stdio.h>

void StrcpyX(char *src, char *dest)
{
    while (*src != '\0')
    {
       *dest = *src;
       src++;
       dest++;
    }

   *dest = '\0'; 
    
}

int main()
{
    char arr[30] = {'\0'};

    printf("Enter the String :\n");
    scanf("%[^'\n']s",arr);

    char brr[30];

    StrcpyX(arr,brr);

    printf("%s",brr);

    return 0;
}