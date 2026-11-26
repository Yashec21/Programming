function CountEvenDigit(no)
{
    let count = 0;
    let iDigit = 0;

    while(no != 0)
    {
        iDigit = no % 10;

        if(iDigit % 2 == 0)
        {
            count++;
        }

        no = no / 10;   // Error / provide 0.0 
    }

    return count;
}

function main()
{
    let iRet = CountEvenDigit(48271);

    console.log("Even Digit is : ",iRet);
}

main();