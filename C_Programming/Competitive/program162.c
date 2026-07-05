#include<stdio.h>

void StrcpyX(char *src, char *dest, int iCnt)
{
    while ((*src != '\0') && (iCnt != 0))
    {
        *dest = *src;
        src++;
        dest++;
        iCnt--;
    }

    *dest = '\0';
    
}

int main()
{
    char arr[30] = {'\0'};
    char brr[30];
    int iNo = 0;

    printf("Enter the String :\n");
    scanf("%[^'\n']s",arr);

    printf("Enter the number :\n");
    scanf("%d",&iNo);

    StrcpyX(arr,brr,iNo);

    printf("%s",brr);

    return 0;
}