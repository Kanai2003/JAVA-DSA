// package OOPs.Apna_College;
/*
in JAVA oops has 4 types of major concepts. 
1 => Abstruction -> (it is use to show important data to user and hide all non-important data from user)
2 => incapsulation -> (it will help us to hide and control data like using --"public","protected","private" etc.)
3 => inheritance -> (it will inherite a class into another class with help of "extends" keyword)
        it has 4 type.=> 
            i->single level , 
            ii->multi level inheritance , 
            iii->Hierarchial inheritance(one base class will use into many child class), 
            iv -> Hybrid inheritance(all type of inheritance will use here)
4 => poly-morphism -> (same name function will use more time in one class)
        it has 2 types => 
            1->function over loading(run time poly-morphism) , 
            2->function over riding(compile time poly-morphism)
*/ 



import java.util.*;

import OOPs.Apna_College.bank.*;


/*poly-morphism("function over loading")------------------------------------------------*/
// class Student{
//     String name ;
//     int age ; 

//     public void printInfo(String name){
//         System.out.println(this.name);
//     }
//     public void printInfo(int age){
//         System.out.println(this.age);
//     }
//     public void printInfo(String name,int age){
//         System.out.println(this.name + " "+this.age);
//     }
// }


/*Inheritance--------------------------------------------------------------------------*/
// class Shape{
//     public void area(){
//         System.out.println("Display area");
//     }
// }
// class Triangle extends Shape{                         /* here 'Shape' is called as 'base class' or 'parent class' and 'Triangle' is called as 'sub-class' or 'child class'*/
//     public void area(int l , int h){
//         System.out.println(1/2 * l * h);
//     }
// }
// class EquilatreralTriangle extends Triangle{
//     public void area(int l , int h){
//         System.out.println(1/2 * l * h);
//     }
// }
// class Circle extends Shape{
//     public void area(int r){
//         System.out.println((3.14)*r*r);
//     }
// }


/**Abstraction ------------------------------------------------------------------------- */
// abstract class Animal{                      /** By using "abstract" key-word we can hide this concept*/
//     abstract public void walk();            /** Basically abstract means we hiding a thing which is just a concept  */
//     Animal(){
//         System.out.println("You are creating a new aimal");
//     }
//     public void eat(){
//         System.out.println("Animals eats");
//     }
// }
// class Horse extends Animal{
//     Horse (){                   /**this function called in java as  "constructor". for construction function at  first main function will call base class's constructor and  then it will call drive or child class's constructor class */
//         System.out.println("Created a Horse");
//     }
//     public  void walk(){
//         System.out.println("Walk on 4 legs");
//     }
// }
// class chiken extends Animal{
//     public void walk(){
//         System.out.println("Walk on two legs");
//     }
// }

// interface Animal{           /** "interface" is basically 'pure abstruction' where we cann't use non-abstracted function and also we cann't use "constructor" method or function */
//     void walk();               /** "interface" is always "abstracted","public","static","final" by default */
// }
// interface Herbivore{                

// }
// class Horse implements Animal , Herbivore{          /** for "interface" we cann't use "extends" key-word , here we have to use "implements" key-word */
//     public void walk(){                             /** by using interface we can use this type of multiple inheritance  */
//         System.out.println("Walk on 4 legs");
//     }
// }

public class oops2 {
    public static void main(String[] args) {
        

        /*poly-morphism("function over loading")------------------------------------------------*/
        // Student s1 = new Student();
        // s1.name = "Kanai";
        // s1.age = 18;

        // s1.printInfo(s1.name);
        // s1.printInfo(s1.age);
        // s1.printInfo(s1.name, s1.age);

        /*Inheritance--------------------------------------------------------------------------*/
        // Triangle t1 = new Triangle();

        //use package -----------------------------------------------
        // bank.Account account1 = new bank.Account();
        // account1.name = "customer1";

        /**Abstruction ----------------------------------------- */
        // Horse horse = new Horse();
        // horse.walk();                             /** we cann't use "Animal" class in "main" function function because it is alredy abstracted class . If we use it then it will be 'run time error' */
        

        Horse horse = new Horse();              /**To use constroctor function we just nee to creat a object like this , in java it is called as "constructor chaining method' */

    }
}
