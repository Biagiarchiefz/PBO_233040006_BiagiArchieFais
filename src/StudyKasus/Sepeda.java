package StudyKasus;

public class Sepeda extends Kendaraan implements Bergerak {
    public void jalan() {
        System.out.println("Sepeda berjalan dengan dikayuh.");
    }

    public void berhenti() {
        System.out.println("Sepeda berhenti dengan rem tangan.");
    }

    public void roda(){
        System.out.println("punya roda 2");
    }

}
