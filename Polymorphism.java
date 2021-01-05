package objectandclass;


public class Polymorphism {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
        //隐式转换
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }

    static class GraduateStudent extends Student {
    }

    static class Student extends Person {
        public String toString() {
            return "Student";
        }
    }

    static class Person extends Object {
        public String toString() {
            return "Person";
        }
    }
}
