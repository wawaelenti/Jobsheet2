public class DosenMain25{
    public static void main(String[] args) {
        Dosen25 dosen1 = new Dosen25();

        dosen1.idDosen="JJ015";
        dosen1.nama="Wawa Elent";
        dosen1.statusAktif=true;
        dosen1.tahunBergabung=2010;
        dosen1.bidangKeahlian="Basis Data";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2024);
        dosen1.ubahKeahlian("Pemrograman");
        dosen1.tampilInformasi();

        Dosen25 dosen2 = new Dosen25("RDJ09", "Laura", true, 2011, "Sistem Operasi");
        dosen2.hitungMasaKerja(2018);
        dosen2.tampilInformasi();

        Dosen25 dosen3 = new Dosen25("RDJ09", "Luna", false, 2017, "Struktur Data");
        dosen3.hitungMasaKerja(2023);
        dosen3.tampilInformasi();
    }
}