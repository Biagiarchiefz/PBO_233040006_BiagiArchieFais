package Final_Static;

public class Mahasiswa {
    private final String nim;               // NIM tidak boleh diubah
    private String nama;

    private static int totalMahasiswa = 0;  // Untuk menghitung jumlah mahasiswa
    public static final int MAX_SKS = 24;   // Konstanta global

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;                  // Tambah setiap kali objek dibuat
    }

    public void displayInfo() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Max SKS : " + MAX_SKS);
        System.out.println("----------------------------");
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
