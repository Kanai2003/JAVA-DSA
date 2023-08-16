package Q1;
class Person {
    String name;
    int age;
    

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    int rollNumber;
    String department;

    public Student(String name, int age, int rollNumber, String department) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Roll Number: " + rollNumber + ", Department: " + department;
    }
}

class Teacher extends Person {
    String subject;
    

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}

public class OOPsClass {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Student("Kanai", 20, 39, "CSE");
        people[1] = new Student("Driptanil", 20, 168, "CSE");
        people[2] = new Teacher("Sanjay Chakraborty", 30, "OOPs Lab");
        people[3] = new Teacher("Pratima Sarkar", 30, "OOPs theory");

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
