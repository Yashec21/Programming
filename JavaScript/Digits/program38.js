function DisplayNumbers(no)
{
    for(let i = 1; i <= no; i++)
    {
        if(i % 2 != 0)
        {
            console.log(i);
        }
    }
}

function main()
{
    DisplayNumbers(10)
}

main();