package OopLectures;
import java.util.Scanner;
public class bankAccountTest {
    public static void main(String[] args) {
        bankAccount b1=new bankAccount();
        Scanner input=new Scanner(System.in);
        System.out.println("enter your balance");
        b1.balance= input.nextDouble();
        System.out.println("enter your name");
        input.nextLine();
        b1.name=input.nextLine();
        System.out.println("press 1 to deposit amount");
        System.out.println("press 2 to withdraw amount");
        System.out.println("press 3 to check balance");
        System.out.println("press 4 to close program");
        int press=input.nextInt();
        int count1=0;
        int count2=0;
        while(press!=4) {
            double amount;
            switch (press) {
                case 1 -> {
                    System.out.println("enter amount");
                    amount = input.nextDouble();
                    b1.deposit(amount);
                    count1++;
                }
                case 2 -> {
                    System.out.println("enter amount");
                    amount = input.nextDouble();
                    b1.checkBalance(amount);
                    if (b1.checkbalance < 50000) {
                        if (b1.checkbalance < 50000) {
                            System.out.println("Are you sure you want to withdraw, it would make your balance below 50,000.\n Press 1 to continue and 0 to abort");
                            press = input.nextInt();
                            if (press == 1) {
                                b1.withdraw(amount);
                                break;
                            } else if (press == 0) {
                                break;
                            }

                        }
                    } else {
                        b1.withdraw(amount);
                    }
                    count2++;
                }
                case 3 -> System.out.println(b1.balance);
            }
            System.out.println("press 1 to deposit amount");
            System.out.println("press 2 to withdraw amount");
            System.out.println("press 3 to check balance");
            System.out.println("press 4 to close program");
            press=input.nextInt();
        }
        System.out.println("account title : "+b1.name);
        System.out.println("total deposits : "+count1);
        System.out.println("total withdraws : "+count2);
        System.out.println("balance :"+b1.balance);
    }

}
