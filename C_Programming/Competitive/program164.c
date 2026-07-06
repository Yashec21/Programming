#include<stdio.h>

void StrCpySmall(char *src, char *dest)
{
    while (*src != '\0')
    {
        if(*src >= 'a' && *src <= 'z')
        {
            *dest = *src;
            dest++;
        }

        src++;
    }

    *dest = '\0';
    
}

int main()
{
    char arr[30] ={'\0'};
    char brr[30];

    printf("Enter String :\n");
    scanf("%[^'\n']s",arr);

    StrCpySmall(arr, brr);

    printf("Captital latter is :\n%s",brr);

    return 0;
}