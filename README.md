# Financial-Portfolio-OOP
Create a Java program according to the specifications stated below:

Include a composition class called “FinancialPortofolio”

Public attributes for the composition class must include the client’s first name (string data type), last name (string data type), portfolio number (integer data type), and total value of the portfolio (double data type)

The composition class must include a savings account class called “SavingsAccount” with the following public attributes: an account number (string), and an account balance (double)

The composition class must include a bonds class called “Bonds” with the following public attributes: bond name (string), face value (double), and number of bonds (integer)

The composition class must include a stocks class called “Stocks” with the following public attributes: stock name (string), stock value (float), and number of shares (integer)

Create setters and getters methods for all the public attributes in each of the classes

Create objects that prompt the user (investment advisor) to enter all of the values for each of the classes

The savings account object must add the balance to the portfolio total value

The bonds object must add the total bonds value (bond value multiplied by the number of bonds) to the portfolio total value

The stocks object must add the total stocks value (stock value multiplied by the number of shares) to the total portfolio value

When a user (investment advisor) runs the Java program, it must prompt the advisor to enter the financial portfolio data, savings account data, stocks data, and bonds data. The program must compute the total value of the portfolio for each asset (savings account, stocks, and bonds).

When all of the data has been entered and the total value of the portfolio has been calculated, the program must display the results using the following format as an example:

```
Portfolio Name: Jane’s Portfolio
Savings account: Blue Bank ($2000.00)
Bonds: Derby ($3000.00)
Stocks: IBM ($10000.00)
Portfolio value: $15000.00
```