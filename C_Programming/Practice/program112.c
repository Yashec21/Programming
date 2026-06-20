#include<stdio.h>

void Display(int Arr[])
{
    int iCnt = 0;

    for(iCnt = 1; iCnt < 8; iCnt++)   //hard coded becuse static memory
    {
        printf("%d\n",Arr[iCnt]);
    }

}

int main()
{
    int Brr[8] = {10,20,30,40,50,60,70,80};

    
    Display(Brr);

    return 0;
}
 
