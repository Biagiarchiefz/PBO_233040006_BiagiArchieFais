package Inheritance.Latiahan3;

public class Orang {
    protected String nama;
    protected String alamat;

    public Orang (String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }


}
