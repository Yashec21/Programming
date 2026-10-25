function DisplayEvenFactors(no)
{
    let i = 0;

    console.log("Even Factors is : ")

    for(i = 1; i <= no; i++)
    {
        if(i % 2 == 0 && no % i == 0)
        {
            console.log(i);
        }
    }
}

function main()
{
    DisplayEvenFactors(20)
}

main();