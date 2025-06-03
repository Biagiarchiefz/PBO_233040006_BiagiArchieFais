package Final_Static;

public class DatabaseConnection {
    public static String connectionString;

    // Static block dijalankan satu kali saat kelas diload pertama kali
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("Static block executed: Connection string initialized.");
    }

}
