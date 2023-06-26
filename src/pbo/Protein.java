
package pbo;

public class Protein {
{	
private String gender;	
private int need;	
private String	source;	
Protein()	
{	

}	
Protein(String	s, int need)	
{	

}	
Protein(String	gender, int need, String source)	
{	
this.gender = gender;
this.need = need;
this.source= source;
}	
}
public class ProteinTest	{	
public static void main(String[] args)	
{	
Protein obj1 = new Protein("Pria",56,"hari"); //buat	3	objek
}	
}
