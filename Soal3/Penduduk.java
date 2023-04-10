package Soal3;

public class Penduduk {
    private String nama, pekerjaan;
    private int pendapatan;

    public Penduduk(String nama, String pekerjaan, int pendapatan) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.pendapatan = pendapatan;

        if(pekerjaan == "Ksatria"){

        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(int pendapatan) {
        this.pendapatan = pendapatan;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + '\n' +
                "Pendapatan: " + pendapatan;
    }
}
