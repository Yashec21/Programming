#include <iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
      public:
            int *Arr;
            int iSize;

            //Parametrized coustructer
            ArrayX(int X)
            {
                  cout<<"Inside constructor\n";

                  iSize = X;              //Characteristics initialisation
                  Arr = new int[iSize];   //Resource allocation 
            }

            //Destructor
            ~ArrayX()
            {
                  cout<<"Inside distructor\n";
                  delete []Arr;           //Resource Deallocation
            }
};

int main()
{

      ArrayX aobj1(5);       
      
      return 0;
      
}