
package pbo;

public class SuperInheritance {
    int num = 110;
}

class Parentclass{
     Parentclass(){
	System.out.println("Constructor of parent class");
     }
}

   class Subclass extends SuperInheritance
{
   int num = 11000;
   
   void printNumber(){
    System.out.println(super.num);
   }
   
   class Subclass2 extends Parentclass {
      Subclass2(){
	System.out.println("Constructor of child class");
   }
         Subclass2(int num){
	System.out.println("arg constructor of child class");
   }

   }

    public static void main(String[] args) {
        Subclass objek = new Subclass();
        objek.printNumber();
    }
        
        Subclass2 obj = new Subclass2(4);
        obj.Subclass2 (3);
        
           }
   
