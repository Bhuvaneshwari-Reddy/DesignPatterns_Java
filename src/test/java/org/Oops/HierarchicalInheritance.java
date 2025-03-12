package org.Oops;


class Animal{
    public void sound(){
        System.out.println("Animals are making noise");
    }
}

class Dog extends Animal{
    public void  bark(){
        System.out.println("Dog is barking");
    }
}

class Cat extends  Animal{
    public void meow(){
        System.out.println("Cat is making meow sound");
    }
}
class Cow extends Animal{

    public void ambo(){
        System.out.println("Cow is making ambo sound ");
    }
}
public class HierarchicalInheritance {

    public static void main(String[] args){
        Dog o1=new Dog();
        o1.bark();
        o1.sound();

        Cat o2=new Cat();
        o2.meow();
        o2.sound();

        Cow o3=new Cow();
        o3.ambo();
        o3.sound();
    }
}
