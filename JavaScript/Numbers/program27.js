function DisplayFactors(no)
{
    let i = 0;

    for(i = no; i > 0; i--)
    {
        if(no % i == 0)
        {
            console.log(i);
        }
    }
}

function main()
{
    DisplayFactors(20);
}

main();