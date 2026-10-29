function DisplayNumbers(no)
{
    let i = 1;

    while(no != 0)
    {
        process.stdout.write(i.toString())
        no--;
        i++;
    }
}

function main()
{
    DisplayNumbers(5)
}

main();