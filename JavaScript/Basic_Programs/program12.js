function CheckNumber(no)
{
    if(no % 3 == 0 && no % 5 == 0)
    {
        console.log(no ," : The number is Divisible by 3 & 5");
    }
    else
    {
        console.log(no ," :the number not Divisible by 3 & 5");
    }
}

function main()
{
    CheckNumber(15)
}

main();