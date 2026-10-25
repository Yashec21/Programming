function DisplayFactors(no)
{
    let i = 0;
    let sumOfNunFac = 0;

    for(i = no; i > 0; i--)
    {
        if(no % i != 0)
        {
            sumOfNunFac = sumOfNunFac + i;
        }
    }

    return sumOfNunFac;
}

function main()
{
    let iRet = DisplayFactors(6);

    console.log("sum of non factors",iRet)
}

main();