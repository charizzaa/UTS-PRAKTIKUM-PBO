package Soal3;

public class Ksatria extends Penduduk{

    public Ksatria(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public double pajak(){
        return getPendapatan()*0.18;
    }
    public double bayar(){
        return getPendapatan()-pajak();
    }
}
