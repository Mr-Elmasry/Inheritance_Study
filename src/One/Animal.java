/*** @author Mr. Ahmed Elmasry 
 *   Mr_el_masry@yahoo.com  *Date:Aug 14, 2014  */

package One;

public class Animal implements Movable{

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
class Dog extends Animal{

}
class Cat extends Animal{

}
class GardDog extends Dog{

}

interface Movable{
  public void move();
}

class AnimalTester {
    public static void main(String[] args) {
        // Creating Some Objects "Instances"
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        GardDog gd = new GardDog();
        // Use Of instanceof Keyword
        System.out.printf("Any Dog Is An Animal?: \t%b\n", d instanceof Animal);
        System.out.printf("Any Cat Is An Animal?: \t%b\n", c instanceof Animal);
        System.out.printf("Any GardDog Is A Dog?: \t%b\n", gd instanceof Dog);
        System.out.printf("Any GardDog Is An Animal?:\t%b\n",gd instanceof Animal);
        System.out.println();
        System.out.printf("Any Dog Is A Movable?: \t%b\n", d instanceof Movable);
        System.out.printf("Any Cat Is A Movable?: \t%b\n", c instanceof Movable);
        System.out.printf("GardDog Is A Movable?:\t%b\n", gd instanceof Movable);
        System.out.printf("Any Animal Is A Movable?:\t%b\n",gd instanceof Movable);
    }
}

/*
*   File: Animal.java 
*   the Reference :www.TutorialsPoint.com with some Modifications  
* -------------------- 
* This program offers a simple example to Demonstrate the Concept 
*  of [IS A] "This Object is a type of that Object.
* Some Facts:
    1- Animal is The Parent [Super Class] of Dog Class.
    2- Animal is The Super Class of Cat Class.
    3- Dog & Cat are SubClasses of Animal Class.
    4- GardDog is a SubClass of Both Dog & Animal.
  Now if we Consider the above Facts & The [IS A] Concept
    we Can Say :
    1- Dog Is A Animal.
    2- Cat is A Animal.
    3- GardDog Is A Dog.
    4- GardDog Is A Animal as well.
*/ 