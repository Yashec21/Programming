function CheckEvenOdd(iNo)
{
    if(iNo % 2 == 0)
    {
        return true
    }
    else
    {
        return false;
    }
}

function main()
{
    let iRet = false;

   iRet = CheckEvenOdd(11);

   if(iRet)
    {
        console.log("Number is even");
    }
    else
    {
        console.log("Number is odd");
    }
}

main();