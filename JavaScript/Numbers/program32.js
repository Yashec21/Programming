/*
    Q11. Print a Character Pattern
    Write a program to print the following pattern, repeating it N times.

    Example:
    - Input: 4
    - Output: $* $* $* $*
*/ 

function DisplayPattern(no)
{
    while(no != 0)
    {
        process.stdout.write(" $ \t * \t",)
        no--;
    }
}

function main()
{
    DisplayPattern(4)
}

main();