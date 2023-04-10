package Soal3;

public class PandaiBesi extends Penduduk{
    public PandaiBesi(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return getPendapatan()*0.06;
    }
    public double bayar(){
        return getPendapatan()-pajak();
    }
}
