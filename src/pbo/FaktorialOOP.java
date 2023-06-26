
package pbo;

 class faktorial{
    private int num;
    public faktorial(int n){       
        if (n>1){
            int numb = n*(n-1)*(n-2)*(n-3)*(n-4);
            this.num=numb;
        }
        else{
            int numb=0;
            this.num=numb;
        }
     }
        public int getNum(){
            return num;
        }
 }
    

public class FaktorialOOP {
    public static  void main(String args[]){
        faktorial angka1 = new faktorial(5);
        System.out.println(angka1.getNum());
      
    }
}
