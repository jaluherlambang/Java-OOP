
package pbo;

 class Guru {
   String tujuan = "Guru" ;
   String namaBuku = "Teori Kuantum"; 
  public String getTujuan() {
	return tujuan; }
   public void setTujuan(String tujuan) {
	this.tujuan = tujuan;  }
   public String getNamaBuku() {
	return namaBuku; }
   public void setNamaBuku (String namaBuku) {
	this. namaBuku = namaBuku; }
   void kerja() {
        System.out.println ("Mengajar") ; 
}
 }

public class ContohPewarisan extends Guru {
String mataPelajaran = "Fisika" ;
   public static void main(String args[]){
	ContohPewarisan obj = new ContohPewarisan ();
	System.out.println(obj. getNamaBuku() );
	System.out.println(obj. getTujuan() );
	System.out.println(obj. mataPelajaran);
	obj.kerja();  }
}


