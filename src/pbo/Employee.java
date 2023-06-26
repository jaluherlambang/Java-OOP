
package pbo;

public class Employee {
    int empId;  
   String empName;  
 //parameterized constructor with two parameters
   Employee(int id, String name){  
       this.empId = id;  
       this.empName = name;  
   }  
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  
  public static void main(String args[]){  
	Employee obj1 = new Employee(10245,"Chaitanya");  
	Employee obj2 = new Employee(92232,"Negan");  
	obj1.info();  
	obj2.info();  
   }  
}
class Example2
{
      private int var;
      //default constructor
      public Example2()   {
             this.var = 10;
       }
      //parameterized constructor
      public Example2(int num)     {
             this.var = num;
      }
      public int getValue()    {
              return var;
      }
      public static void main(String args[])  {
              Example2 obj = new Example2();
              Example2 obj2 = new Example2(100);
              System.out.println("var is: "+obj.getValue());
              System.out.println("var is: "+obj2.getValue());
      }
}

class Example3 {
      private int var;
      public Example3(int num) {
             var=num;
      }
      public int getValue() {
              return var;
      }
      public static void main(String args[]){
              Example3 myobj = new Example3(4);
              System.out.println("value of var is: "+myobj.getValue());
      }
}
