package org.Oops;


class Vehicle{

    private String speed;
    private  int wheels;

    public Vehicle(String speed,int wheels){
        this.speed=speed;
        this.wheels=wheels;
    }

    public String toString(){
        return ("No of wheels: "+wheels+"\n"
        +"Speed of vehicle:"+speed);
    }
}

class Car extends Vehicle{

    private  String colour;
    public  Car(String speed,int wheels,String colour){
        super(speed,wheels);
      this.colour=colour;
    }

    @Override
    public String toString(){
        return (super.toString()+"\n"
                +"colour of car:"+colour);
    }
}
public class InheritanceDemo {

    public  static  void main(String[] args){
        Car obj=new Car(" 50kmph",4,"Grey");
        System.out.println(obj.toString());

    }
}
