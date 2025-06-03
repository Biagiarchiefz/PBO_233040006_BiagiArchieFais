package Final_Static;

public class TestMahasiswa {
    public static void main(String[] args) {

            Mahasiswa m1 = new Mahasiswa("233040040", "Madun");
            Mahasiswa m2 = new Mahasiswa("23340858", "Maria");
            Mahasiswa m3 = new Mahasiswa("23305049", "Murod");

            m1.displayInfo();
            m2.displayInfo();
            m3.displayInfo();

            System.out.println("Total Mahasiswa Terdaftar: " + Mahasiswa.getTotalMahasiswa());

    }
}
