package OopLectures;

public class Account {
    private String id;
    private String name;
    private int age;
    private double balance;

    public Account(String id) {
        setId(id);
    }

    public Account(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount){
        balance-=amount;

    }
    void deposit(double amount){
        balance+=amount;
    }
    void accountBalance(){

        if (getAge()>=20 && getAge()<25)
            balance=50000;
        else if (getAge()>=25 && getAge()<30)
            balance=25000;
        else if (getAge()>=30 && getAge()<=35)
            balance=10000;
        else if (getAge()>35)
            balance=0;
    }

}
