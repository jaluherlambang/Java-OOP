
package Abstract_Inteface;

import java.util.Scanner;
abstract class Deklarasi {
public double panjang, lebar, tinggi, radius, lBalok, lTabung, vBalok, vTabung;
public abstract void luasPermukaanBalok();
public abstract void luasPermukaanTabung();
public abstract void volumeBalok();
public abstract void volumeTabung();
}

interface Konstanta {
public static final double kons_pi = 3.14;
public static final String kons_luas = " cm persegi";
public static final String kons_volume = " cm kubik";
}

class Oke extends Deklarasi implements Konstanta {
    @Override
public void luasPermukaanBalok () {
lBalok = 2*((panjang*lebar)+(panjang*tinggi)+(lebar+tinggi));
System.out.println ("\nLuas Permukaan Balok = "+lBalok+kons_luas);
}
@Override
public void volumeBalok () {
vBalok = panjang*lebar*tinggi;
System.out.println ("Volume Balok = "+vBalok+kons_volume);
}
@Override
public void luasPermukaanTabung () {
lTabung = 
(2*kons_pi*radius*radius)+(kons_pi*2*radius*tinggi);
System.out.println ("\nLuas Permukaan Tabung = "+lTabung+kons_luas);
}
@Override
public void volumeTabung () {
vTabung = 2*kons_pi*radius*radius*tinggi;
System.out.println ("Volume Tabung = "+vTabung+kons_volume);
}

public void tampilkan(){
System.out.println 
("**************************************************************");
System.out.println ("\n\tMENGHITUNG LUAS PERMUKAAN DAN VOLUME BANGUN RUANG");
System.out.println ("\n\tPILIHAN :");
System.out.println ("\t1. BALOK");
System.out.println ("\t2. TABUNG");
System.out.println 
("\n**************************************************************");
}
}
public class Jalan {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
Oke jalan = new Oke();
int a;
jalan.tampilkan();
System.out.print ("\nMasukkan pilihan Anda : ");
a = input.nextInt();
System.out.println 
("\n**************************************************************");
if (a==1){
System.out.println ("\nAnda akan menghitung luas permukaan dan volume BALOK");
System.out.print ("\nMasukkan nilai panjang = ");
jalan.panjang = input.nextInt();
System.out.print ("Masukkan nilai lebar = ");
jalan.lebar = input.nextInt();
System.out.print ("Masukkan nilai tinggi = ");
jalan.tinggi = input.nextInt();
System.out.println 
("\n**************************************************************");
jalan.luasPermukaanBalok();
jalan.volumeBalok();
}
else if (a==2){
System.out.println ("\nAnda akan menghitung luas permukaan dan volume TABUNG");
System.out.print ("\nMasukkan nilai radius = ");
jalan.radius = input.nextInt();
System.out.print ("Masukkan nilai tinggi = ");
jalan.tinggi = input.nextInt();
System.out.println
("\n**************************************************************");
jalan.luasPermukaanTabung();
jalan.volumeTabung();
}
else {
System.out.println ("Anda salah input. Masukkan angka 1 atau 2!");
}
}
}
