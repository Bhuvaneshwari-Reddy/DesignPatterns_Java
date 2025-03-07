package org.Practice;
import com.google.gson.Gson;
import lombok.Builder;


//Separates the construction of a complex object from its representation,
// allowing the same construction process to create various representations

//declare static variables in class
@Builder
    class Laptop{
        private  String os;
        private int ram;
        private boolean graphic;
        private String colour;
//
//        //private constructor for object creation via builder
//        private Laptop(LaptopBuilder builder){
//            this.os=builder.os;
//            this.colour=builder.colour;
//            this.graphic =builder.graphic;
//            this.ram=builder.ram;

        }
        //static builder class
//        public static class LaptopBuilder{
//            private  String os;
//            private int ram;
//            private boolean graphic;
//            private String colour;
//
//
//            //mandatory parameters in constructor
//            public LaptopBuilder(String os,int ram ){
//                this.os=os;
//                this.ram=ram;
//            }
//
//            //optional parameters with method chaining
//            public LaptopBuilder setGraphic(boolean graphic){
//                this.graphic=graphic;
//                return  this;
//            }
//
//            public LaptopBuilder setColour(String colour){
//                this.colour=colour;
//                return this;
//            }
//
//            //build method return the final object
//            public Laptop build(){
//                return  new Laptop(this);
//            }
//        }
//    }



public class BuilderPattern {
    public static void main(String[] args){
// create a Laptop object using builder

//       Laptop obj= new Laptop.LaptopBuilder("Windows", 64)
//                .setColour("Grey")
//                .setGraphic(false)
//                 .build();

        //create object using Lombok's @Builder
        Laptop obj=Laptop.builder()
                .colour("Red")
                .graphic(true)
                .os("Windows")
                .ram(64)
                .build();

        Gson gson = new Gson();
        String output = gson.toJson(obj);
        System.out.println("Laptop properties:" +output);
    }
}


