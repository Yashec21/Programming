function Calculate(no1, no2)
{
    let Result = 0;

    Result = no1 + no2;
    console.log("Addition is : ",Result);

    Result = no1 - no2;
    console.log("Substraction is : ",Result);

    Result = no1 * no2;
    console.log("Multiplacation is : ",Result);

    Result = no1 / no2;
    console.log("Division is : ",Result);
}

function main()
{
    Calculate(5,5);
}

main();