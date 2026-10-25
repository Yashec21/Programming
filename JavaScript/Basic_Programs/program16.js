
function SumFactors(no)
{
    let Sum = 0;

    for(let i = 1; i <= (no / 2); i++)
    {
        if(no % i === 0)
        {
            Sum = Sum + i;
        }
    }

    return Sum;
}

function main()
{
    const readline = require("readline");

    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question("Enter a Number: ", (input) =>
    {
        let no = Number(input);

        let iRet = SumFactors(no);

        console.log("Addition of factors is:", iRet);

        rl.close();
    });
}

main();
