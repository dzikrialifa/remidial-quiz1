/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package id.dzik.remidial;
public class Transport {
    private Kapal kapal;
    private Pesawat pesawat;

    public Transport() {
    }

    public void setKapal(Kapal kapal) {
        this.kapal = kapal;
    }

    public void setPesawat(Pesawat pesawat) {
        this.pesawat = pesawat;
    }
    public int hargaTotal(){
        int total = this.kapal.getHarga() * this.kapal.getOrang();
                return total;
    }
    public void info(){
        String info = "";
        System.out.println("Transportasi Kapal\t: "+this.kapal.info());
        System.out.println("Transportasi Pesawat\t: ");
        System.out.println("Total harga Armada\t: "+hargaTotal());
    }
}
