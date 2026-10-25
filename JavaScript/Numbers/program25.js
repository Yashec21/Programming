function CheckVowel(ch)
{
    if( ch == 'a' || ch == 'e' || 
        ch == 'i' || ch == 'o' || 
        ch == 'u')
    {
        console.log("It is Vowel")
    }
    else
    {
        console.log("It is not Vowel");
    }
}

function main()
{
    CheckVowel('u')
}

main();