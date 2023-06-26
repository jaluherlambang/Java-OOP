
package pbo;

public class Hello {

        String name;
   //Constructor
   Hello(){
      this.name ="java itu mudah";
   }
   public static void main(String[] args) {
      Hello obj = new Hello();
      System.out.println(obj.name);

    }
    
}

class NoteBook{
NoteBook(){
      System.out.println("Default constructor");
   }
   public void mymethod()
   {
      System.out.println("Void method of the class");
   }
   public static void main(String args[]){
		NoteBook obj = new NoteBook();
	obj.mymethod();
   }
}



