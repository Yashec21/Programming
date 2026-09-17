#include<iostream>
using namespace std;

float Maximum(float No1, float No2)
{
    if (No1 < No2)
    {
        return No2;
    }
    else
    {
        return No1;
    }
    
}

int main()     
{
    cout<<Maximum(21.2f,11.0f)<<"\n";
       
    return 0;
}