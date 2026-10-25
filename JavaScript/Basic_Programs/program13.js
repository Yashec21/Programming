function CheckNumber(no)
{
    if(no % 3 == 0 && no % 5 == 0)
    {
        return true
    }
    else
    {
        return false
    }
}

function main()
{
    let bRet = false

    let no = 15;

    bRet = CheckNumber(no)

    if(true)
    {
        console.log(no ," : The number is Divisible by 3 & 5");
    }
    else
    {
        console.log(no ," :the number not Divisible by 3 & 5");
    }
}

main();