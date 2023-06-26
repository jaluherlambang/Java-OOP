
package pbo;

public class Perpustakaan {

 private String nama,buku,penerbit;

    
    
    public void tampil(String x,String y,String z){
    nama = x;
    buku = y;
    penerbit = z;

    System.out.println("Nama peminjam : " + nama);
    System.out.println("Nama buku : " + buku);
    System.out.println("Penerbit : " + penerbit);
    System.out.println();
    }

    public static void main(String [] args){
        Perpustakaan A = new Perpustakaan();
        A.tampil("Rossi","Hemat Pangkal Kaya", "Cemerlang");


        Perpustakaan B = new Perpustakaan();
        B.tampil("Marquez", "Rajin Pangkal Pandai", "Cerdas");
    }  
}