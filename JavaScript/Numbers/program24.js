function ConverCharacterCase(ch)
{
    if(ch >= 'a' && ch <= 'z')
    {
        ch = ch.toUpperCase();
    }
    else
    {
        ch = ch.toLowerCase();
    }

    return ch;
}

function main()
{
    let cRet = ConverCharacterCase('a')

    console.log(cRet);
}

main();