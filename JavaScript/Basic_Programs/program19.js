
function CheckNumber(no)
{
   if(no % 5 == 0)
   {
        return true;
   }
   else
   {
        return false;
   }
}

function main()
{
    let bRet = 0;

    bRet = CheckNumber(20);

    if(bRet)
    {
        console.log("Number is Divisible by 5")
    }
    else
    {
        console.log("Number is not Divisible by 5")
    }
}

main();
