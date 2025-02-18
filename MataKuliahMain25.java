public class MataKuliahMain25 {
    public static void main(String[] args) {
        MataKuliah25 matkul1 = new MataKuliah25();
        matkul1.kodeMK = "ALSD";
        matkul1.nama = "Algoritma dan Struktur Data";
        matkul1.sks = 3;
        matkul1.jumlahJam = 10;

        matkul1.tampilInformasi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(5);
        matkul1.kurangiJam(3);
        matkul1.tampilInformasi();

        MataKuliah25 matkul2 = new MataKuliah25("BSD", "Basis Data", 2, 4);
        matkul2.tambahJam(3);
        matkul2.tampilInformasi();

        MataKuliah25 matkul3 = new MataKuliah25("SISOP", "Sistem Operasi", 2, 4);
        matkul3.kurangiJam(2);
        matkul3.tampilInformasi();
    }
}