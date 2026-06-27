#include<stdio.h>

int Difference(char *str)
{
    int iCnt1 = 0;
    int iCnt2 = 0;
    int iFrequency = 0;

    while (*str != '\0')
    {
        if( *str >= 'A' && *str <= 'Z')
        {
            iCnt1++;
        }
        if (*str >= 'a' && *str <= 'z')
        {
            iCnt2++;
        }

        str++;
        
    }

    iFrequency = iCnt1 - iCnt2;

    if(iFrequency < 0)
    {
        iFrequency = -iFrequency;
    }

    return iFrequency;
    
}



int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    iRet = Difference(arr);

    printf("Frequency is :%d",iRet);

    return 0;
    
}