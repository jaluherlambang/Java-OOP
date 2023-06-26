
package pbo;

public class Tabungan {

public double saldo;

public Tabungan(double jumlah){
    this.saldo = jumlah;
}
public void AmbilUang(double jumlah){
    this.saldo = saldo-jumlah;
}
public void nabung (double jumlah){
    this.saldo = saldo + jumlah;
}
public void AmbilSaldo (double jumlah){
    saldo = saldo - jumlah;
    
}

}
class TesTabungan{
    public static void main(String[] args) {
        Tabungan NewTabungan = new Tabungan (5000000);
        System.out.println("Jumlah Saldo : "+ NewTabungan.saldo);
        NewTabungan.AmbilUang(1000000);
        System.out.println("Jumlah Saldo Setelah Di Ambil : " + NewTabungan.saldo);
        NewTabungan.nabung(3000000);
        System.out.println("Jumlah saldo setelah nabung : "+NewTabungan.saldo);
        NewTabungan.AmbilSaldo(6000000);
        System.out.println("Jumlah Saldo setelah nraktir : " + NewTabungan.saldo);
    }
}
