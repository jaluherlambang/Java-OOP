
package pbo;

public class Polimorfism_Overriding {
   public void Animal_sound(){
      System.out.println("Animal is making a sound");   
   }
}
class Horse extends Polimorfism_Overriding{
    @Override
    public void Animal_sound(){
        System.out.println("Neigh");
    }
}
class Cat extends Polimorfism_Overriding{
    @Override
    public void Animal_sound(){
        System.out.println("Meong");
    }

    public static void main(String args[]){
        
        Horse obj = new Horse();
    	obj.Animal_sound();
        Cat obj2 = new Cat();
            obj2.Animal_sound();
        
    }
}                       