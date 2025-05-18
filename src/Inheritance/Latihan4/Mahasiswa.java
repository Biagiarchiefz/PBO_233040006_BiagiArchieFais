package Inheritance.Latihan4;

public class Mahasiswa extends Orang {
    private String nrp;
    public Mahasiswa(String nrp, String nama, String alamat){
        super(nama, alamat); // memanggil konstruktor milik superclass (Orang) untuk mengisi nama dan alamat.
        setNrp(nrp);
    }

    public String getNrp(){
        return nrp;
    }

    public void setNrp(String nrp){
        this.nrp = nrp;
    }

}
