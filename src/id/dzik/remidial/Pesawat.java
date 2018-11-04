/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package id.dzik.remidial;
public class Pesawat {
    private String nama;
    private int harga;
    private int orang;

    public Pesawat() {
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
        if (this.nama.equalsIgnoreCase("Air Asia")) {
            this.harga = 1200000;
        }else if (this.nama.equalsIgnoreCase("Batik Air")) {
            this.harga = 500000;
        }else if (this.nama.equalsIgnoreCase("Garuda Indonesia")) {
            this.harga = 1000000;
        }else if (this.nama.equalsIgnoreCase("Lion Air")) {
            this.harga = 250000;
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
      public String info(){
          String info = "";
          info += "Memilih Armada "+getNama()+"\n";
          info += "Kuota Kapal\t\t: "+getOrang()+"\n";
          info += "Harga Tiket\t\t: "+getHarga()+"/orang\n";
          return info;
      }
    
    
}
