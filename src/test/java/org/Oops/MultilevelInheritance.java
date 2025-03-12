package org.Oops;


class One{
    public void print(){
        System.out.println("1st class");
    }
}

class Two extends One{
    public void print1(){
        System.out.println("2nd class");
    }
}
class Three extends Two{

    public void print2(){
        System.out.println("3rd class");
    }
}


public class MultilevelInheritance {
    public static void main(String[] args){
        Three obj=new Three();
        obj.print();
        obj.print1();
        obj.print2();
    }
}
