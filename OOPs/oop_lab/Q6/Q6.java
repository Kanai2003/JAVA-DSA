// Interface Sports
interface Sports {
    int getSportWeight();
}

// Class Student
class Student {
    String name;
    int rollNo;
    String department;
    int marks1;
    int marks2;

    public Student(String name, int rollNo, String department, int marks1, int marks2) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }
}

// Class Marks inheriting from Student
class Marks extends Student {
    int totalMarks;

    public Marks(String name, int rollNo, String department, int marks1, int marks2) {
        super(name, rollNo, department, marks1, marks2);
        totalMarks = marks1 + marks2;
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }

    public void putDetails() {
        System.out.println("Total Marks: " + totalMarks);
    }
}

// Class Result inheriting from Marks and implementing Sports
class Result extends Marks implements Sports {
    int sportWeight;

    public Result(String name, int rollNo, String department, int marks1, int marks2, int sportWeight) {
        super(name, rollNo, department, marks1, marks2);
        this.sportWeight = sportWeight;
    }

    @Override
    public int getSportWeight() {
        return sportWeight;
    }
}

// Main class
public class Q6{
    public static void main(String[] args) {
        Result studentResult = new Result("John", 123, "Computer Science", 85, 90, 5);

        studentResult.getDetails();
        studentResult.putDetails();
        System.out.println("Sport Weight: " + studentResult.getSportWeight());
    }
}
