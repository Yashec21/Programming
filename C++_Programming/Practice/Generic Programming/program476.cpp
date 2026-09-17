#include<iostream>
using namespace std;

float Maximum(float No1, float No2)
{
    float Ans;

    if (No1 < No2)
    {
        Ans = No2;
    }
    else
    {
        Ans = No1;
    }

    return Ans;
    
}

int main()     
{
    cout<<Maximum(21.2f,11.0f)<<"\n";
       
    return 0;
}