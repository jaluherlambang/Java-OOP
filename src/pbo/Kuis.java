
package pbo;

class KuisNo2{

    int  nilai1;
    int  nilai2;

KuisNo2 (){
        nilai1 = 10;
     nilai2 = 20;
     System.out.println("Constructor A");
}
KuisNo2 (int a){
        nilai1 = a;
        System.out.println("Constructor B");
}
KuisNo2 (int a,int b){
      nilai1 = a;
      nilai2 = b;
      System.out.println(" Constructor C");
}
public void display(){
        System.out.println("nilai1 === "+ nilai1);
        System.out.println("nilai2; === "+ nilai2);
}
public static void main(String args[]){
KuisNo2 d1 = new KuisNo2 ();
KuisNo2 d2 = new KuisNo2 (30);
KuisNo2 d3 = new KuisNo2(30,40);
d1.display();
d2.display();
d3.display();
}
}
