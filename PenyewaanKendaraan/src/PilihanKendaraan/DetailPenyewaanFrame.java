package PilihanKendaraan;

import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.*;

public class DetailPenyewaanFrame extends JFrame {
    private JTextField namaField;
    private JTextField teleponField;
    private JRadioButton[] kendaraanButtons;
    private JTextField hariField;
    private JButton simpanButton;

    public DetailPenyewaanFrame() {
        setTitle("Detail Penyewaan");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Inisialisasi components
        namaField = new JTextField(20);
        teleponField = new JTextField(20);
        kendaraanButtons = new JRadioButton[3];
        kendaraanButtons[0] = new JRadioButton("Motor - Rp. 100.000/hari");
        kendaraanButtons[1] = new JRadioButton("Mobil - Rp. 200.000/hari");
        kendaraanButtons[2] = new JRadioButton("Truk - Rp. 300.000/hari");
        hariField = new JTextField(10);
        simpanButton = new JButton("Simpan");

        // Set layout
        setLayout(new GridLayout(6, 1));

        // Tambah components ke frame
        add(new JLabel("Nama Penyewa:"));
        add(namaField);
        add(new JLabel("Nomor Telepon:"));
        add(teleponField);
        add(new JLabel("Jenis Kendaraan:"));
        ButtonGroup kendaraanGroup = new ButtonGroup();
        for (JRadioButton button : kendaraanButtons) {
            kendaraanGroup.add(button);
            add(button);
        }
        add(new JLabel("Jumlah Hari:"));
        add(hariField);
        add(simpanButton);

        // Set frame
        setVisible(true);
    }

    public DetailPenyewaanFrame(String motor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
