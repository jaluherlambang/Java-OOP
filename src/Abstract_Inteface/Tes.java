
package Abstract_Inteface;

interface Operasi {
double kons_pi = 3.14;
String kons_panjang = " cm";
void kelilingLingkaran (double radius);
void kelilingPersegi();
}

class Hitung implements Operasi {
double lingkaran, persegi;
double sisi = 5;
@Override
public void kelilingLingkaran(double radius){
System.out.println ("\n Menghitung Keliling Lingkaran");
System.out.println ("Nilai Radius\t= "+radius+kons_panjang);
lingkaran = kons_pi*2*radius;
System.out.println ("Keliling Lingkaran = "+lingkaran+kons_panjang);
}
@Override
public void kelilingPersegi(){
System.out.println ("\n Menghitung Keliling Persegi");
System.out.println ("Nilai Sisi\t= "+sisi+kons_panjang);
persegi = 4*sisi;
System.out.println ("Keliling Lingkaran = "+persegi+kons_panjang);
}
}

public class Tes {
public static void main(String[] args) {
Hitung main = new Hitung();
main.kelilingLingkaran(5);
main.kelilingPersegi();
}
}