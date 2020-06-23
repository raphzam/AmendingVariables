#Amending Variables

IPO

INPUT
none / variables pre defined

OUTPUT
-Robert's annual income on the fifth year

PROCESS

BEGIN

GETTING INPUT
    currentIncome was already defined
    currentIncome = $62,000
    

CALCULATIONS

    incomeYear1 = currentIncome + (currentIncome * 10);
    
    incomeYear2 = incomeYear1 + (incomeYear1 * .10)

    incomeYear3 = incomeYear2 + (incomeYear2 * .10)

    incomeYear4 = incomeYear3 + (incomeYear3 * .10)

    incomeYear5 = incomeYear4 + (incomeYear4 * .10)

OUTPUT

    display incomeYear5

END