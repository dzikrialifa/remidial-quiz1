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
    public int hargaTotalKapal(){
        int total = this.kapal.getHarga() * this.kapal.getOrang();
                return total;
    }
    public int hargaTotalPesawat(){
        int total = this.pesawat.getHarga() * this.pesawat.getOrang();
        return total;
    }
    public void info(){
        String info = "";
        System.out.println("=========================================");
        System.out.println("Transportasi Kapal\t: "+this.kapal.info());
        System.out.println("Transportasi Pesawat\t: "+this.pesawat.info());
        System.out.println("----------------------------------------------------");
        System.out.println("Total keuntungan Armada Kapal\t: "+hargaTotalKapal());
        System.out.println("Total keuntungan Armada Pesawat\t: "+hargaTotalPesawat());
        System.out.println("----------------------------------------------------");
    }
}
