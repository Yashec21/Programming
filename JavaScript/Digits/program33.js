function DisplayNumbers(no)
{
    let i = 1;

    while(no != 0)
    {
        process.stdout.write(i) //Error this statement only print String
        no--;
        i++;
    }
}

function main()
{
    DisplayNumbers(5)
}

main();