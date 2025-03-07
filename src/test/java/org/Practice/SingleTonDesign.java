package org.Practice;

//Ensures a class has only one instance and provides a global point of access to it.
class Demo{
    private static Demo obj;     //declare a static variable
    Demo(){}                     // declare a no args constructor

    //declare a class to check the instance
    public static Demo getObj(){
        if(obj==null){
            obj=new Demo();          //create instance when needed
        }
        return obj;
    }
    public void addition(int x,int y){
      int res=x+y;
      System.out.println("Addition Res: "+res);
    }
    public void sub(int x,int y){
        int res=x-y;
        System.out.println("Subtraction Res: "+res);
    }
}
public  class SingleTonDesign{
     public static  void main(String[] args){
         Demo o1=new Demo();
         o1.addition(5,8);
         o1.sub(8,3);

         Demo o2=new Demo();
         o2.addition(15,10);
         o2.sub(50,25);

         Demo o3=new Demo();
         o3.addition(15,2);
         o3.sub(5,2);


         if(o1==o2 && o2==o3){
             System.out.println("All objects have same reference");
         }else{
             System.out.println("All objects does not have same reference");
         }
     }

}


