package org.Oops;


class Algebra{
    void add(int a,int b){
        int res=a+b;
        System.out.println("Addition of two numbers: "+ res);
    }
}

class Subtraction extends Algebra{
    void sub(int a,int b ){
        int res=a-b;
        System.out.println("Subraction of numbers: "+ res);
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        Subtraction obj=new Subtraction();
        obj.sub(10,8);
        obj.add(50,25);
    }
}
