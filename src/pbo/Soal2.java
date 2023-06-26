
package pbo;

public class Soal2 {

    public static void main(String[] args) {
        Hewan hewan1 = new kucing();
        System.out.println("Jumlah hewan1 = " + hewan1.jumlah);
        hewan1.suara();
        //hewan1.info();
        harimau tiger = new harimau();
        System.out.println("Jumlah tiger = " + tiger.jumlah);
        tiger.suara(tiger);
        Hewan hewan2 = new harimau();
        System.out.println("Jumlah hewan 2 = " + hewan2.jumlah);
        hewan2.suara();
    }   
}
class Hewan{
    int jumlah = 0;
    
    public void suara() {
        System.out.println("-----");
    }
}
class kucing extends Hewan{
    int jumlah =10;
    public void info(){
        System.out.println("Puzzzzzz puzzz");
    }
}
class harimau extends Hewan{
    int jumlah = 7;
    public void suara(){
        System.out.println("auuung auuung");
    }
    public void suara(harimau T){
        System.out.println("Guk guk");
    }
}