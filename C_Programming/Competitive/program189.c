#include <stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0
typedef unsigned int UINT;

BOOL ChkBit(UINT iNo, UINT pos1, UINT pos2) 
{
    UINT iMask = 0;
    UINT Ans = 0;
    
    iMask = (1 << (pos1 - 1)) | (1 << (pos2 - 1));
    Ans = iNo & iMask;

    if (Ans != 0) {
        return TRUE;
    } else {
        return FALSE;
    }
}

int main() 
{
    UINT iNo = 0; 
    BOOL bRet = FALSE; 
    UINT pos1 = 0;
    UINT pos2 = 0; 

    printf("Enter number: ");
    scanf("%u", &iNo);

    printf("Enter position 1: ");
    scanf("%u", &pos1);

    printf("Enter position 2: ");
    scanf("%u", &pos2);

    bRet = ChkBit(iNo, pos1, pos2);
    
    if (bRet == TRUE) 
    {
        printf("Bit at 1st position or 2nd position is ON\n");
    } 
    else
    {
        printf("Both bits at 1st and 2nd positions are OFF\n");
    }
    
    return 0;
}
