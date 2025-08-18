import javax.swing.*;
import java.awt.*;

public class CabService extends JFrame {

    public CabService() {
        setTitle("Cab Service");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Panel
        JPanel panel = new JPanel(new BorderLayout());

        // Title
        JLabel title = new JLabel("🚖 Welcome to Cab Service", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(title, BorderLayout.NORTH);

        // Center Panel with Buttons
        JPanel centerPanel = new JPanel(new GridLayout(3, 1, 10, 10));

        JButton bookRideBtn = new JButton("Book a Ride");
        JButton fareEstimateBtn = new JButton("Get Fare Estimate");
        JButton exitBtn = new JButton("Exit");

        centerPanel.add(bookRideBtn);
        centerPanel.add(fareEstimateBtn);
        centerPanel.add(exitBtn);

        panel.add(centerPanel, BorderLayout.CENTER);
        add(panel);

        // Book Ride Action
        bookRideBtn.addActionListener(e -> {
            String pickup = JOptionPane.showInputDialog(this, "Enter Pickup Location:");
            String drop = JOptionPane.showInputDialog(this, "Enter Drop Location:");

            if (pickup != null && drop != null && !pickup.isEmpty() && !drop.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "✅ Ride Booked!\nPickup: " + pickup + "\nDrop: " + drop,
                        "Booking Confirmed",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "❌ Invalid input. Please enter both locations.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // Fare Estimate Action
        fareEstimateBtn.addActionListener(e -> {
            String distanceStr = JOptionPane.showInputDialog(this, "Enter Distance (in km):");

            try {
                double distance = Double.parseDouble(distanceStr);
                double ratePerKm = 15.0; // ₹15 per km
                double fare = distance * ratePerKm;

                JOptionPane.showMessageDialog(this,
                        "Estimated Fare: ₹" + fare,
                        "Fare Estimate",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "❌ Please enter a valid number for distance.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // Exit Action
        exitBtn.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CabService().setVisible(true);
        });
    }
}
