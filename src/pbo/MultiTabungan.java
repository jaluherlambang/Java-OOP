
package pbo;


import java.util.Scanner;

public class MultiTabungan {
    private int saldo;
	public MultiTabungan (int initsaldo) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("jenis mata uang");
    	System.out.println("USD tekan 1 \nAUD tekan 2 \nIDR tekan 3");
    	System.out.print("");
    	int a = input.nextInt();
    	if(a == 1) {
        	this.saldo = initsaldo*9000;
    	}else
        	if(a == 2){
            	this.saldo = initsaldo*10000;
        	}else
            	if(a == 3){
                	this.saldo = initsaldo;
            	}else
                    System.out.println("error");
	}
	public int getSaldo() {
    	return saldo;
        }
public void simpanUang(int jumlah) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("jenis mata uang");
    	System.out.println("USD tekan 1 \nAUD tekan 2 \nIDR tekan 3");
    	System.out.print("");
    	int a = input.nextInt();
    	if(a == 1) {
        	this.saldo += jumlah*9000;
    	}else
        	if(a == 2){
            	this.saldo += jumlah*10000;
        	}else
            	if(a == 3){
                	this.saldo += jumlah;
            	}else
       	         System.out.println("error");
	}
	public boolean ambilUang(int jumlah) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("jenis mata uang");
    	System.out.println("USD tekan 1 \nAUD tekan 2 \nIDR tekan 3");
    	System.out.print("");
    	int a = input.nextInt();
    	int b = saldo;
    	if(a == 1) {
            b -= jumlah*9000;
    	}else
        	if(a == 2){
            	b -= jumlah*10000;
        	}else
            	if(a == 3){
                	b -= jumlah;
            	}else
                    System.out.println("error");
    	
    	if(b >= 0){
        	this.saldo = b;
        	return true;
    	}
    	else
        	return false;
	}	

}
class MainTabungan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    	boolean control = true;
        System.out.print("Masukkan saldo awal : ");
    	int a = input.nextInt();
    	MultiTabungan obj = new MultiTabungan(a);
    	
    	do {
            System.out.println("=====Pilihan=====");
    	System.out.println("Cek Saldo tekan 1 \nSimpan Uang tekan 2 "
            	+ "\nAmbil Uang tekan 3 \nKeluar tekan 4");
    	System.out.print("");
    	int b = input.nextInt();
    	
        if (b == 1){
        	System.out.println("Saldo : " + obj.getSaldo() + " IDR");
    	} else
        	if (b == 2){
                System.out.println("=====Simpan Uang=====");
            	System.out.print("Masukkan angka : ");
      	      int c = input.nextInt();
            	obj.simpanUang(c);
        	}else
            	if (b == 3){
                    System.out.println("=====Ambil Uang=====");
                    System.out.print("Masukkan angka : ");
                	int d = input.nextInt();
                	boolean e = obj.ambilUang(d);
                        if(e == true)
                        System.out.println("-Penarikan sukses-");
                	else
                    	System.out.println("Saldo tidak mencukupi");
            	}else
                	if(b == 4){
                    	control = false;
                	}else
                        System.out.println("kode salah");  
    	} while (control); 
    }
}