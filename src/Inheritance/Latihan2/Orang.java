package Inheritance.Latihan2;

public class Orang {
    protected String nama;
    protected String alamat;

    public Orang(){
        nama = "ade sukandar";
        alamat = "Bandung";
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }
}
