package pbo;
class Phone {
    
    private String merk;
    private String warna;
    
    Phone(){
        System.out.println("Konstruktor class phone tanpa parameter");
    }
    Phone(String m, String w){
        merk = m;
        warna = w;
    }
    
    public void setMerk(String m){
        this.merk = m;
    }
    public String getMerk(){
        return merk;
    }
    public void setWarna(String w){
        this.warna = w;
    }
    public String getWarna(){
        return warna;
    }
    
    public void display(){
        System.out.println("Isi Method class phone");
        System.out.println("Merk HP : " + this.getMerk());
        System.out.println("Warna HP : " + this.getWarna());        
    }
}


class cellPhone extends Phone {
    
    private int IMEI;
    protected String jaringan;
    
    cellPhone(){
        System.out.println("Konstruktor cellPhone tanpa parameter");
    }
    cellPhone(int im){
        IMEI = im;
    }
    
    public void setIMEI(int no){
        this.IMEI = no;
    }
    public int getIMEI(){
        return IMEI;
    }
    public void setJaringan(String j){
        this.jaringan = j;
    }
    public String getJaringan(){
        return jaringan;
    }
    
    
    public void display (){
        System.out.println("Isi method class cellPhone");
        System.out.println("IMEI HP : " + this.getIMEI());
        System.out.println("Jaringan HP : " + this.getJaringan());
    }
}

class pabx extends Phone {
    
    private String type;
    
    pabx(){
        System.out.println("Konstruktor pabx");
    }
    public void setType(String t){
        this.type = t;
    }
    public String getType(){
        return type;
    } 
    
    @Override
    public void display (){
        System.out.println("Isi method class pabx");
        System.out.println("Tipe HP : " + this.getType());
    }
}

class android extends cellPhone {
    
    private String versi;
    private int memory;
    
    android(){
        System.out.println("Konstruktor android");
    }
    android(String v){
        versi = v;
    }
    
    public void setVersi(String v){
        this.versi = v;
    }
    public String getVersi(){
        return versi;
    }
    public void setMemory(int me){
        this.memory = me;
    }
    public int getMemory(){
        return memory;
    }
    
    @Override
    public void display(){
        System.out.println("Isi method class android");
        System.out.println("Versi HP :" + this.getVersi());
        System.out.println("Memory HP : " + this.getMemory());
    }
    
    public static void main(String[] args) {
        Phone p1 = new pabx();
        p1.display();
        
        System.out.println();
        
        cellPhone a1 = new android ();
        a1.display();
        
        System.out.println();
        
        cellPhone a2 = new android (" Android 10");
        a2.display();
    }
}

