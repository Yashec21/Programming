#include<stdio.h>
#include<stdlib.h>

int CountFrequancy(int Arr[], int iSize)
{
   int iCnt = 0, iCount = 0;
   

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == 11)     //Arr[iCnt] index of array iCnt is upadate 
        {
            iCount++;
        }
    }

    return iCount;
}

int main()
{
    int *Brr = NULL;
    int iLength = 0 , iCnt = 0 ,iRet = 0;

    printf("Enter the number of element : \n");
    scanf("%d",&iLength);

    Brr = (int *)malloc (sizeof(int) * iLength);

    printf("Enter the elements :\n");

    for (iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }
    
    iRet = CountFrequancy(Brr, iLength);
    printf("Frequancy : %d\n",iRet);

    free(Brr);


    return 0;
}