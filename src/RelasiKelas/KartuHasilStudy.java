package RelasiKelas;

import KelasObject.Matakuliah;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudy {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    // konstruktor
    public KartuHasilStudy(String semester){
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void addMataKuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display(){
        StringBuilder sb = new StringBuilder();
        for( Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIps(){
        double totalBobot = 0;
        int totalSKS = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalBobot += mk.getIndex() * mk.getSKS();
            totalSKS += mk.getSKS();
        }

        if (totalSKS > 0) {
            this.ips = totalBobot / totalSKS;
        } else {
            this.ips = 0;
        }

    }

    public Double getIps (){
        return ips;
    }
    public String getSemester(){
        return semester;
    }

}