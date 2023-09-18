package lab_task1;

public class Main {
    public static void main(String[] args) {
        Music m1 = new Music("black","4:00","sad",new Date(23,12,2016),new Singer("alanWalker","male","american",new Date(13,5,2011)));
        Music m2 = new Music("back","3:00","pop",new Date(3,2,2006),new Singer("Walker","male","british",new Date(1,9,2018)));

        System.out.println(m1);
        System.out.println(m2);

        System.out.println(m1.equals(m2));

    }
}
