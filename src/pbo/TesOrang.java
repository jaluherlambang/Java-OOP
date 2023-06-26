
package pbo;
class orang {

  private float bobot;
    private float tinggi;
    private float bmi;
    
public float setBobot(float x){
    return this.bobot;
}
public float setTinggi(float x){
    return this.tinggi;
}
public float setBmi(float x){
    return this.bmi;
}
public double getWeight(){
    return 68;
}
public double getHeight(){
    return 1.65;
}
public float getBmi(float x){
    return this.bmi;
}
public double calculateBmi(){
    return getWeight()/(getHeight()*getHeight());
}
}

    public class TesOrang extends orang{
    public static void main(String[] args) {

        TesOrang saya = new TesOrang();
        saya.getHeight();
        saya.getWeight();
        System.out.println(saya.calculateBmi());
    }
     
    
}



