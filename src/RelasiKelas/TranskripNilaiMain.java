package RelasiKelas;

import KelasObject.Matakuliah;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create object matakuliah
        Matakuliah mk1 = new Matakuliah("001","Algoritma", "A", 3);
        Matakuliah mk2 = new Matakuliah("002","Matemmatika", "B", 2);
        Matakuliah mk3 = new Matakuliah("003","PBO", "A", 2);

        // membuat object khs
        KartuHasilStudy khs = new KartuHasilStudy("2");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);


        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040006", "biagi");

        // membuat object transkripnilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);

        // Hitung IPK keseluruhan
        transkrip.hitungIPK();

        transkrip.display();
    }

}