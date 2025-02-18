public class MataKuliah25 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks=sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam += jam;
           
    }

    void kurangiJam(int jam){
        if (jumlahJam >= jam){
            jumlahJam -= jam;
                System.out.println("Jam berhasil dikurangi");
            } else {
                System.out.println("Jumlah jam tidak cukup untuk dikurangi");
            }
        }

        public MataKuliah25() {

        }

    public MataKuliah25(String km, String nm, int sks, int jj){
        kodeMK = km;
        nama = nm;
        this.sks = sks;
        jumlahJam = jj;
    }
}