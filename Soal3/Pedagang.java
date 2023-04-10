package Soal3;

public class Pedagang extends Penduduk{

    public Pedagang(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public double pajak(){
        return getPendapatan()*0.12;
    }
    public double bayar(){
        return getPendapatan()-pajak();
    }

}
