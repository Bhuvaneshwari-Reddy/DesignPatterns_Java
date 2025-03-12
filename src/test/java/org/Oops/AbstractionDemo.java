package org.Oops;


    abstract  class VehicleDemo{
        String name;

        //abstract methods
        public abstract  int wheels();
        public  abstract String toString();

        //constructor for abstract class
        public  VehicleDemo(String name){
            this.name=name;
        }

        //concrete method
        public  String getName(){
            return  name;
        }
    }


    class Truck extends  VehicleDemo{
        String colour;

        public  Truck(String name,String colour){
            super(name);
            this.colour=colour;
        }
        @Override
        public int wheels(){
            return  6;
        }
        @Override
        public  String toString(){
            return  "Name of the Truck: " + super.getName() + "\n" +
                    "Color: " + colour + "\n" +
                    "No of wheels: " + wheels();
        }
    }

    class Van extends  VehicleDemo{
        String speed;
        int seats;

        public Van(String name, String speed,int seats){
            super(name);
            this.speed=speed;
            this.seats=seats;
        }
        @Override
        public int wheels(){
            return 4;
        }
        @Override
        public  String toString(){
            return "Name of the Vehicle: " + super.getName() + "\n" +
                    "Speed: " + speed + "\n" +
                    "Seats: " + seats + "\n" +
                    "No of wheels: " + wheels();
        }


    }



public class AbstractionDemo {
    public static  void main(String[] args){
        VehicleDemo v=new Truck("Tata","grey");
        VehicleDemo v1=new Van("Omini","60kmph",8);
        System.out.println(v.toString());
        System.out.println(v1.toString());
    }

}
