
package pbo;

public class Mahasiswa {

    private int nrp;
    private String nama;
    
    public Mahasiswa(int i,String n) {
        this.nrp = i;
        this.nama = n;
    }
    public int getNRP() {
        return nrp;
    }
    public String getNama(){
        return nama;
    }
    public int setNRP(){
        return nrp = 11324;
    }
    public String setNama(){
        return nama = "beneran jalu";
    }
}
 class TesMahasiswa{   
         public static void main (String [] args) {
            Mahasiswa baru = new Mahasiswa(1132,"jalu herlambang");
            System.out.println("NRP : "+ baru.getNRP());
            System.out.println("Nama =" + baru.getNama());
             System.out.println("New NRP : " + baru.setNRP());
             System.out.println("New Nama : " + baru.setNama());
        }
      
   
    
}
