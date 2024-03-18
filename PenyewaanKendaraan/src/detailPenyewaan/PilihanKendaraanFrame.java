package detailPenyewaan;

import PilihanKendaraan.DetailPenyewaanFrame;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.*;


public class PilihanKendaraanFrame extends JFrame {
    private JButton motorButton;
    private JButton mobilButton;

    public PilihanKendaraanFrame () {
        setTitle("Pilihan Kendaraan");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Initialize components
        motorButton = new JButton("Motor");
        mobilButton = new JButton("Mobil");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to frame
        add(motorButton);
        add(mobilButton);
        
        /*
        
        
        
        // Add action listeners to buttons
        motorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create and show detail frame for motor
                DetailPenyewaanFrame detailFrame = new DetailPenyewaanFrame("Motor");
                detailFrame.setVisible(true);
                dispose(); // Close current frame
            }
        });

        mobilButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create and show detail frame for mobil
                DetailPenyewaanFrame detailFrame = new DetailPenyewaanFrame("Mobil");
                detailFrame.setVisible(true);
                dispose(); // Close current frame
            }
        });
        */
        // Set frame visible
        setVisible(true);
    }
}
