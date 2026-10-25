function LargeNumber(no1, no2,no3)
{
    let max = 0;

    if(no1 > no2 && no1 > no3)
    {
        max = no1;
    }
    else if(no2 < no3)
    {
        max = no3;
    }
    else
    {
        return no2;
    }

    return max
}

function main()
{
    let iRet = 0;
    iRet = LargeNumber(5,15,10);

    console.log("Large number is : ",iRet);
}

main();