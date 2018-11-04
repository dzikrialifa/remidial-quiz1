/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package id.dzik.remidial;
public class Kapal {
    private String nama;
    private int harga;
    private int kuota;
    
    public Kapal() {
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
        setHarga();
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga() {
        if (this.nama.equalsIgnoreCase("Garuda Indonesia")) {
            this.harga = 1000000;
        }else if (this.nama.equalsIgnoreCase("Sriwijaya Air")) {
            this.harga = 750000;
        }else if (this.nama.equalsIgnoreCase("Lion Air")) {
            this.harga = 500000;
        }else{
            System.out.println("Menu not found");
        }
    }
    
    
    
    
}
