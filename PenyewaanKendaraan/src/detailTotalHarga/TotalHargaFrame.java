package detailTotalHarga;

import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.*;

public class TotalHargaFrame extends JFrame {
    private JLabel namaLabel;
    private JLabel teleponLabel;
    private JLabel kendaraanLabel;
    private JLabel hargaLabel;
    private JLabel hariLabel;
    private JLabel totalLabel;
    private JButton selesaiButton;

    public TotalHargaFrame(String nama, String telepon, String kendaraan, int hargaPerHari, int hari) {
        setTitle("Detail dan Total Harga");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Perhitungan total harga
        int totalHarga = hargaPerHari * hari;

        // Inisialisasi components
        namaLabel = new JLabel("Nama: " + nama);
        teleponLabel = new JLabel("Telepon: " + telepon);
        kendaraanLabel = new JLabel("Kendaraan: " + kendaraan + " - Rp. " + hargaPerHari + "/hari");
        hargaLabel = new JLabel("Harga: Rp. " + hargaPerHari + "/hari");
        hariLabel = new JLabel("Hari: " + hari);
        totalLabel = new JLabel("Total Harga: Rp. " + totalHarga);
        selesaiButton = new JButton("Selesai");

        // Set layout
        setLayout(new GridLayout(7, 1));

        // Tambah components ke frame
        add(namaLabel);
        add(teleponLabel);
        add(kendaraanLabel);
        add(hargaLabel);
        add(hariLabel);
        add(totalLabel);
        add(selesaiButton);

        // Set frame visible
        setVisible(true);
    }
}