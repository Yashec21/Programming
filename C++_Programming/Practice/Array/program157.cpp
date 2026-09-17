#include <iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
      public:
            int *Arr;
            int iSize;

            //Default constructer
            ArrayX()
            {
                  
            }

            //Parametrized coustructer
            ArrayX(int X)
            {

            }
};

int main()
{

      ArrayX aobj1;        //DEfault
      ArrayX aobj2(5);     //Parmeterized

      cout<<sizeof(aobj1)<<endl;  //16
      return 0;
      
}