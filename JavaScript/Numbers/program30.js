function DisplayFactors(no)
{
    let i = 0;
    let sumOfNunFac = 0;
    let sumOfFac = 0;

    for(i = 1; i <= no; i++)
    {
        if(no % i != 0)
        {
            sumOfNunFac = sumOfNunFac + i;
        }
        else
        {
            sumOfFac = sumOfFac + i;
        }
    }

    return (sumOfFac - sumOfNunFac);
}

function main()
{
    let iRet = DisplayFactors(6);

    console.log("Differanc of non factors & factors : ",iRet)
}

main();