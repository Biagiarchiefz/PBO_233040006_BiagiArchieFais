package Tugas_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Kalkulator extends JFrame implements ActionListener {

    private JTextField textField1;
    private JTextField textField2;
    private JButton jumlahButton;

    public Kalkulator() {
        setTitle("Kalkulator Penjumlahan");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Menempatkan window di tengah layar
        setLayout(new GridLayout(3, 1, 10, 10)); // Layout grid 3 baris, 1 kolom

        // Inisialisasi komponen
        textField1 = new JTextField();
        textField2 = new JTextField();
        jumlahButton = new JButton("Jumlah");

        // Menambahkan listener untuk tombol
        jumlahButton.addActionListener(this);

        // Menambahkan komponen ke Frame
        add(textField1);
        add(textField2);
        add(jumlahButton);

        // Menampilkan Frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Memeriksa apakah sumber event adalah tombol "Jumlah"
        if (e.getSource() == jumlahButton) {
            hitungJumlah();
        }
    }


    private void hitungJumlah() {
        try {
            // Mengambil teks dari textfield dan mengubahnya menjadi integer
            int nilai1 = Integer.parseInt(textField1.getText());
            int nilai2 = Integer.parseInt(textField2.getText());

            // Menjumlahkan kedua nilai
            int hasil = nilai1 + nilai2;

            // Menampilkan hasil menggunakan JOptionPane sesuai permintaan
            // Format: (parentComponent, message, title, messageType)
            JOptionPane.showMessageDialog(
                    this,
                    "Jumlah: " + hasil,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException ex) {
            // Menampilkan pesan error jika input bukan angka yang valid
            JOptionPane.showMessageDialog(
                    this,
                    "Input harus berupa angka yang valid!",
                    "Error Input",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}