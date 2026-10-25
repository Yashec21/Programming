function DisplayEven(no)
{
    let i = 0;

    console.log("Even number is : ")

    for(i = 1; i <= no; i++)
    {
        if(i % 2 == 0)
        {
            console.log(i);
        }
    }
}

function main()
{
    DisplayEven(20)
}

main();