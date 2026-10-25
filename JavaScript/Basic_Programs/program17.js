
function PerfectNumber(no)
{
    let sum = 0;

    for(let i = 1; i <=(no / 2); i++)
    {
        if(no % i == 0)
        {
            sum = sum + i
        }
    }

    if(sum == no)
    {
        console.log(no,"is a perfect number")
    }
    else
    {
        console.log(no,"is not a perfect number")
    }
}

function main()
{
    PerfectNumber(26);
}

main();
