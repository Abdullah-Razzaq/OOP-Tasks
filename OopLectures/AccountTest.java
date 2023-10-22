package OopLectures;

import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {

        Account a2=new Account("sp23");
        Account a1=new Account("abdullah",20);
        Scanner input=new Scanner(System.in);

        System.out.println("open your account in our bank");
        System.out.println("enter name");
        a1.setName(input.nextLine());

        System.out.println("enter age");
        a1.setAge(input.nextInt());


        if (a1.getAge()>20){

        a1.accountBalance();
        System.out.println("press 1 to deposit amount");
        System.out.println("press 2 to withdraw amount");
        System.out.println("press 3 to check balance");
        System.out.println("press 4 to close program");
        int press=input.nextInt();
        while(press!=4) {
            double amount;
            switch (press) {
                case 1 -> {
                    System.out.println("enter amount");
                    amount = input.nextDouble();
                    a1.deposit(amount);
                }
                case 2 -> {
                    System.out.println("enter amount");
                    amount = input.nextDouble();
                        a1.withdraw(amount);
                }
                case 3 -> System.out.println(a1.getBalance());
            }

            System.out.println("press 1 to deposit amount");
            System.out.println("press 2 to withdraw amount");
            System.out.println("press 3 to check balance");
            System.out.println("press 4 to close program");
            press=input.nextInt();
        }

            System.out.println("thanks for using our services");
        }
        else if (a1.getAge()<20)
            System.out.println("you cannot open your account");

    }
}
