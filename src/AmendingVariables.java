import java.util.Scanner;

public class AmendingVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        VARIABLES

        double currentIncome = 62000;           //defined in the module
        double annualIncrease = .10;            //10 percent increase

//        CALCULATIONS

        double incomeYear2 = currentIncome + (currentIncome * annualIncrease);

        double incomeYear3 = incomeYear2 + (incomeYear2 * annualIncrease);

        double incomeYear4 = incomeYear3 + (incomeYear3 * annualIncrease);

        double incomeYear5 = incomeYear4 + (incomeYear4 * annualIncrease);

//        OUTPUT

        System.out.println("Robert's annual income on year 5 will be $" + incomeYear5);



    }
}
