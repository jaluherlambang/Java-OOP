
package pbo;

class Binatang {
    
    public void makan() {
        System.out.println("Binatang sedang makan");
}
}

class Anjing extends Binatang{
    @Override
    public void makan(){
        System.out.println("Anjing sedang makan tulang");
    }
    public void suara(){
        System.out.println("Guk-Guk");
    }
}
class Kucing extends Binatang{
@Override
public void makan(){
    System.out.println("Kucing sedang makan ikan");
}
public void suara(){
    System.out.println("Meong");
}
}
public class Casting_Binatang {

    public static void main(String[] args) {
        //memanggil method
       Binatang binatang1 = new Binatang();
       Anjing anjing1 = new Anjing();
       binatang1.makan();
       anjing1.makan();
       anjing1.suara();
        System.out.println("\t---------------------");
        
        System.out.println("---------UPCASTING--------");
        Binatang binatang2 = anjing1;
        binatang2.makan();
        ((Anjing)binatang2).suara();
         //atau
         Binatang binatang3 = (Binatang) new Kucing();
        //Binatang binatang3=new Kucing();
        binatang3.makan();
        ((Kucing)binatang3).suara();
        
        System.out.println("\t-----------------");
        System.out.println("----------DOWNCASTING-------------");
        //manual,
        Anjing anjing2 = (Anjing) binatang2;
        anjing2.makan();
        anjing2.suara();
        
        Kucing kucing2 = (Kucing) binatang3;
        kucing2.makan();
        kucing2.suara();
        System.out.println("\t-------------------");
        
        System.out.println("---------ErrorCastException---------");
        Binatang binatang4 = new Binatang();
        Anjing anjing3 = (Anjing) binatang4;
        anjing3.makan();
        anjing3.suara();
    }
    
}
