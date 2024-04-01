/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Student
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  cat c=new cat();
  c.meow();
  c.eat();
dog d=new dog();
d.bark();
    }
    }
    

class Animal{
    void eat()
    {System.out.println("eating..");
}}
class dog extends Animal
{void bark()
    {System.out.println("barking");
}}
  class cat extends Animal
{void meow()
    {System.out.println("meowing");
}}
             









