#include<iostream>
using namespace std;

int Maximum(int No1, int No2)
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
    cout<<Maximum(21,11)<<"\n";
       
    return 0;
}