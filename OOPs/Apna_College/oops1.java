// package OOPs.Apna_College;
//Example -> 1 ------------------------------------------------------------------
class Pen{
    String color;
    String type;              // ballpen or gelpen
    public void write(){
        System.out.println("Write something ");
    }

    public void printColor() {
        System.out.println(this.color);                 /*"this" comond will asign that which  function is calling */        
    }
    public void printType(){
        System.out.println(this.type);
    }
}


//Example -> 2 ----------------------------------------------------------------
class Student{
    String name ;
    int age ; 

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name , int age){
        this.name = name;                        
        this.age = age;
    }
}

//Example -> 3 (copy construction)----------------------------------------------------
class Student1{
    String name ;
    int age ; 

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student1(Student s2){
        this.name = s2.name;                        
        this.age = s2.age;
    }

    Student1(){}
    
}





                                                          /* By convension in JAVA ---'class' name should start with 'Capitel letter' */
                                                          /* By convension in JAVA ---'function' name should start with 'Small letter' */

public class oops1{                                               
    public static void main(String[] args) {               /** "static" means accsable for all class and all data will be same or common for all  */  
                                                            /** "static" can use in 4 type . 1->before propaty, 2->before function, 3->before any block , 4->before nested class */

        //Example -> 1 ---------------------------------
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Ball Pen";
        // System.out.println(pen1.type);
        // System.out.println(pen1.color);

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "Gel Pen";
        // System.out.println(pen2.type);
        // System.out.println(pen2.color);


        // pen1.printColor();
        // pen1.printType();
        // pen2.printColor();
        // pen2.printType();
        


        //Example -> 2 --------------------------------
        // Student s1 = new Student("Kanai", 18);
        // s1.printInfo();


        //Example -> 3 (copy construction)--------------------------------
        // Student1 s1 = new Student1();
        // s1.name = "Kanai";
        // s1.age = 18;

        // Student1 s2 = new Student1(s1);
        // s2.printInfo();


    }
}