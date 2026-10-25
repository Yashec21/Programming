function CheckEvenOdd(iNo)
{
    return(iNo % 2 == 0)
}

function main()
{
    let iRet = false;

   iRet = CheckEvenOdd(11);

   if(iRet == true)
    {
        console.log("Number is even");
    }
    else
    {
        console.log("Number is odd");
    }
}

main();