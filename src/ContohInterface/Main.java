package ContohInterface;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // membuat objek HP
        Phone redmiNote8 = new Xiaomi();
        Phone oppoReno4 = new Oppo();
        // membuat objek user
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan Nama User : ");
        String User1 = inputUser.nextLine();
        //String User2 = inputUser.nextLine();
        
        Scanner pilihHP = new Scanner(System.in);
        System.out.println("Welcome "+User1+" Silahkan pilih HP ");
        System.out.println("[1] Xiaomi");
        System.out.println("[2] Oppo ");
        int HP1 = pilihHP.nextInt();
        
        if(HP1 == 1){
            PhoneUser user1 = new PhoneUser(redmiNote8);
            Scanner input = new Scanner(System.in);
        String aksi; 
        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.endsWith("1")){
                user1.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                user1.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                user1.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                user1.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
        }
        else if(HP1 ==2){
        PhoneUser user1 = new PhoneUser(oppoReno4);
        Scanner input = new Scanner(System.in);
        String aksi; 
        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.endsWith("1")){
                user1.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                user1.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                user1.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                user1.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    } else{
            System.out.println("HP TIDAK TERSEDIA :(");
        }
            
        /*PhoneUser user1 = new PhoneUser(redmiNote8);
        //PhoneUser jalu = new PhoneUser(oppoReno4);
        // kita coba nyalakan HP-nya
        //dian.turnOnThePhone();
        //jalu.turnOnThePhone();
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi; 
        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.endsWith("1")){
                dian.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                dian.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                dian.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }*/

    }

}

