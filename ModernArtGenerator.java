/**
 * HelloWorld Hackathon
 *
 * This program will generate random shapes to simulate abstract art
 *
 * Clark Chan, chan239@purdue.edu, lc2
 *
 * 9-15-18
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ModernArtGenerator extends JFrame implements ActionListener {

    public static void main(String[] args) {
        ModernArtGenerator frame = new ModernArtGenerator();
    }

    public ModernArtGenerator() {
        setTitle("Modern Art Generator");
        setSize(1980, 1080);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ArtPanel panel = new ArtPanel();
        JButton newArt = new JButton("click for new art");
        newArt.addActionListener(this);
        add(newArt, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
