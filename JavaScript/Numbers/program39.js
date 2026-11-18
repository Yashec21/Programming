function DisplayNumbers(no)
{
    let multi = 0;

    for(let i = 1; i <= 5; i++)
    {
        multi = no * i;

        console.log(multi);
    }
}

function main()
{
    DisplayNumbers(7);
}

main();