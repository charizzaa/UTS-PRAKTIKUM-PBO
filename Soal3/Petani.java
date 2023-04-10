package Soal3;

public class Petani extends Penduduk{

    public Petani(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public double pajak(){
        return getPendapatan()*0.03;
    }
    public double bayar(){
        return getPendapatan()-pajak();
    }
}
