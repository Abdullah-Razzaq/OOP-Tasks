package OopLectures;

public class bankAccount {
    double balance;
    String name;
    double checkbalance;


    void deposit(double amount){
        balance+=amount;
        if (balance>100000){
            double bonus=amount/100.0;
            balance+=bonus;
        }
    }

    void withdraw(double amount){

        if (checkbalance<50000)
        {
            double tax=amount/50.0;
            balance=balance-amount-tax;
        }
        else
            balance-=amount;
        }
    void checkBalance(double amount){
        checkbalance=balance-amount;

    }

}
