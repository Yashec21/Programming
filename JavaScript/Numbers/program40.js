function DisplayNumbers(no)
{
    if(no < 50)
    {
        console.log("Small");
    }
    else if( 50 < no)
    {
        console.log("Medium");
    }
    else
    {
        console.log("Large");
    }
}

function main()
{
    DisplayNumbers(75);
}

main();