package Soal1;

public class Item {
    int harga, quantity;
    String nama, rank;
    public Item(int harga, String nama, String rank, int quantity) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    //harga per item
    public int getHarga(){
        return quantity*harga;
    }

    public int worth(){
        int total = 0;
        return total = total + getHarga();
    }

    public String seeAllItem(){
        return toString();
    }
    @Override
    public String toString() {
        return "Your Item backpack worth: " + " with  item as listed below:" +
                '\n' + quantity + " " + rank + " " + nama + " " + "worth: " + getHarga();
    }
}
