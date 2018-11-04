/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package id.dzik.remidial;
public class Kapal {
    private String nama;
    private int harga;
    private int orang;
    
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
        if (this.nama.equalsIgnoreCase("KM Senopati")) {
            this.harga = 150000;
        }else if (this.nama.equalsIgnoreCase("KM Arjuna")) {
            this.harga = 100000;
        }else if (this.nama.equalsIgnoreCase("KM Basudewa")) {
            this.harga = 50000;
        }else{
            System.out.println("Menu not found");
        }
    }

    public int getOrang() {
        return orang;
    }

    public void setOrang(int orang) {
        this.orang = orang;
    }
    public void setHargaOrg(){
        if (this.nama.equalsIgnoreCase("Dewasa")) {
            this.harga = 1000000;
        }else if (this.nama.equalsIgnoreCase("Anak")) {
            this.harga = 750000;
        }else{
            System.out.println("Menu not found");
        }
    }
      public String info(){
          String info = "";
          info += "Memilih Kapal\t: "+getNama()+"\n";
          info += "Kuota Kapal\t\t: "+getOrang()+"\n";
          info += "Harga Tiket\t\t: "+getHarga()+"\n";
          return info;
      }
    
    
    
}
