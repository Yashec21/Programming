class NumberX
{
    constructor(factor)
    {
        this.Num = factor;
    }

    Product () 
    {
        let icnt = 0;
        let factor = 1;

        for(icnt = 1; icnt < this.Num; icnt++)
        {
            if(this.Num % icnt == 0)
            {
                factor = factor * icnt;
            }
        }

        return factor;
    }
}

function main()
{
    let nobj = new NumberX(6);

    let iRet = nobj.Product();

    console.log("Product is : ", iRet);
}

main();