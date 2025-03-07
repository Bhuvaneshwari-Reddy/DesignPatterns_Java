package org.Practice;

//Creates objects without exposing the instantiation logic to the client
// and refers to the newly created object through a common interface.
   interface Shape{               //declare interface
     void draw();                  //declare a method ,when the class implements interface ,execute this method
    }

    class Circle implements  Shape{
       public void draw(){
           System.out.println("Drawing circle");
       }
    }
    class Rectangle implements  Shape{
       public void draw(){
           System.out.println("Drawing rectangle");
       }
    }

    class Square implements Shape{
       public void draw(){
           System.out.println("Drawing square");
       }
    }


// This method hides the logic of object creation
    class ShapeTypes{
        public static Shape getShapes(String type){
       if(type==null){
       return null;
       }
       if(type.equalsIgnoreCase("CIRCLE")){
        return new Circle();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
        return new Rectangle();
       } else if (type.equalsIgnoreCase("SQUARE")) {
       return  new Square();
       }
       return  null;
       }
    }


public class FactoryDesign {
public static void  main(String [] args){
    ShapeTypes shapeTypes=new ShapeTypes();

   Shape shape1=shapeTypes.getShapes("CIRCLE");
   shape1.draw();

    Shape shape2=shapeTypes.getShapes("RECTANGLE");
    shape2.draw();

    Shape shape3=shapeTypes.getShapes("SQUARE");
    shape3.draw();
}

}
