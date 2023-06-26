
package ContohInterface;

public class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;
    
    public Oppo(){
    this.volume = 80;
}
    public int getVolume(){
    return this.volume;
}
    @Override
    public void powerOn(){
     isPowerOn = true;
        System.out.println("Hp Oppo Menyala........");
        System.out.println("SELAMAT DATANG DI HP OPPO");
}
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone mati");
    }
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume sudah " + getVolume()+"%");
            } else{
                this.volume +=10;
                System.out.println("Volume sekarang " + getVolume());
            }
        }
        else{
            System.out.println("Nyalakan HP nya dulu dong Pak !!!!!!!!!!" );
        }  
    }
    public void volumeDown(){
        if(isPowerOn){
            if(this.volume==MIN_VOLUME){
                System.out.println("Volume sudah " + getVolume()+ "%");
            }else{
                this.volume -=10;
                System.out.println("Volume sekarang " + getVolume());
            }
        }
        else{
            System.out.println("Nyalakan HP nya dulu dong BAMBANGGGG!!!!!!!!!!");
        }  
        
    }
}