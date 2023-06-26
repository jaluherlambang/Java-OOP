
package pbo;
class BilanganKompleks{
    private int Real;
    private int Imajinerangka;
    private String Kompleks;
    
    public BilanganKompleks(int angka, int angka2) {
     this.Real = angka;
     this. Imajinerangka = angka2;
}
    public int getReal(){
        return Real;
    }
    
     public int getimajinerangka(){
         return Imajinerangka;
     
    }

 public class Kompleks{
     String Kompleks(){
         return getReal() + getimajinerangka() + "i" ;
     }
    
}
}
public class TesBilanganKompleks {

    public static void main(String[] args) {
      BilanganKompleks pertama = new BilanganKompleks(10, 13);
      BilanganKompleks kedua = new BilanganKompleks(5,7);
      Kompleks Penjumlahan = new Kompleks();
              int PenjumlahanReal= pertama.getReal()+kedua.getReal();
      int PenjumlahanImajiner = pertama.getimajinerangka() + kedua.getimajinerangka();
      String Imajiner = pertama.getimajiner()+kedua.getimajiner();
    
        System.out.println("Penjumlahan bilangan kompleks = " + PenjumlahanReal + " + "+ PenjumlahanImajiner +Imajiner );
             
    }
    
}
