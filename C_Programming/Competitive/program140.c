#include<stdio.h>

void DisplaySchedule(char chDiv)
{
    if (chDiv == 'a' || chDiv == 'A')
    {
        printf("Your exam at 7:00 AM");
    }
    else if (chDiv == 'b' || chDiv == 'B')
    {
        printf("Your exam at 8:30 AM");
    }
    else if (chDiv == 'c' || chDiv == 'C')
    {
        printf("Your exam at 9:20 AM");
    }
    else if (chDiv == 'd' || chDiv == 'D')
    {
        printf("Your exam at 10:30 AM");
    }
    else
    {
        printf("Invalid Division...");
    }
    
    
}

int main()
{
    char cValue = '\0';

    printf("Enter your devision :\n");
    scanf("%c",&cValue);

    DisplaySchedule(cValue);

    return 0;
}