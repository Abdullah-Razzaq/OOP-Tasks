package OopLectures;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee("341028181","abdullah");
        Employee e3=new Employee("65327452","saad",5600.0);
        System.out.println(e1);
        System.out.println(e2.getCnic());
        System.out.println(e2.getName());
        System.out.println(e3.getCnic());
        System.out.println(e3.getName());
        System.out.println(e3.getSalary());
    }
}
