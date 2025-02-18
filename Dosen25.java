public class Dosen25 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    
    void tampilInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Aktif/Tidak: " + statusAktif);
        System.out.println("Bergabung pada tahun: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    void hitungMasaKerja(int tahunSekarang){
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa kerja dosen: " + masaKerja + " tahun");
    }

    void ubahKeahlian(String keahlianBaru){
        bidangKeahlian = keahlianBaru;
    }

    public Dosen25(){
    }

    public Dosen25(String id, String nm, boolean status, int tahun, String keahlian){
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = tahun;
        bidangKeahlian = keahlian;
    }
}