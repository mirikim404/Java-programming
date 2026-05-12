package week7.Lab7_6;

class Person {
    void work() {
        System.out.println("Person: 일합니다.");
    }
}

class Student extends Person {
    @Override
    void work() {
        System.out.println("Student: 공부와 과제를 합니다.");
    }
}

class Researcher extends Person {
    @Override
    void work() {
        System.out.println("Researcher: 연구를 합니다.");
    }
}

class Professor extends Researcher {
    @Override
    void work() {
        System.out.println("Professor: 수업준비를 합니다.");
    }
}

public class InstanceTest {

    public static void work(Person p) {
        if (p instanceof Person)     System.out.println("Person: 일합니다.");
        if (p instanceof Student)    System.out.println("Student: 공부와 과제를 합니다.");
        if (p instanceof Researcher) System.out.println("Researcher: 연구를 합니다.");
        if (p instanceof Professor)  System.out.println("Professor: 수업준비를 합니다.");
        System.out.println("  → 타입: " + p.getClass().getSimpleName());
        System.out.println();
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Student();
        Person p3 = new Researcher();
        Person p4 = new Professor();

        work(p1);
        work(p2);
        work(p3);
        work(p4);
    }
}