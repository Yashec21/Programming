function DisplayFactors(no)
{
   let i = 0;

   for(i = 0; i <= (no/2); i++)
   {
        if(no % i == 0)
        {
            console.log(i,"\t");
        }
   }
}

function main()
{
    DisplayFactors(20)
}

main();