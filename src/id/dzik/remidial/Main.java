/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package id.dzik.remidial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Kapal kp = new Kapal();
        
        System.out.println("=== TRANSPORTASI LAUT ===");
        System.out.println("1. KM Senopati");
        System.out.println("2. KM Arjuna");
        System.out.println("3. KM Basudewa");
        
        System.out.print("\nPilih Armada Laut : ");
        int pilkp = x.nextInt();
        if (pilkp == 1) {
            kp.setNama("KM Senopati");
        }else if (pilkp == 2) {
            kp.setNama("KM Arjuna");
        }else{
            kp.setNama("KM Basudewa");
        }
        System.out.print("Input kuota jumlah penumpang Kapal : ");
        int pdk = x.nextInt();
        kp.setOrang(pdk);
        System.out.println("");
        /////////////////////////
        Pesawat ps = new Pesawat();
        System.out.println("=== TRANSPORTASI UDARA ===");
        System.out.println("1. Air Asia");
        System.out.println("2. Batik Air");
        System.out.println("3. Garuda Indonesia");
        System.out.println("4. Lion Air");
        
        System.out.print("\nPilih Armada Penerbangan : ");
        int pilps = x.nextInt();
        if (pilps == 1) {
            ps.setNama("Air Asia");
        }else if (pilkp == 2) {
            ps.setNama("Batik Air");
        }else if (pilkp == 3) {
            ps.setNama("Garuda Indonesia");
        }else{
            ps.setNama("Lion Air");
        }
        System.out.print("Input kuota jumlah penumpang Pesawat : ");
        int pdp = x.nextInt();
        ps.setOrang(pdp);
        ////////////////////////////
        
        Transport t = new Transport();
        t.setKapal(kp);
        t.setPesawat(ps);
        t.info();
    }
}
