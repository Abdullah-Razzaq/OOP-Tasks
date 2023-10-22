package OopLectures;

public class Test {
    public static void main(String[] args) {

        Person p1=new Person(-1,"abdullah",20);
        Person p2=new Person(2,"saad",21);

        printData(p1);
        printData(p2);
    }
    public static void printData(Person p){
        System.out.println(p.getId());
        System.out.println(p.name);
        System.out.println(p.age);

    }
}
