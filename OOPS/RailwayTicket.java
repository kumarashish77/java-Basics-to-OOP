package OOPS;

import javax.swing.*;
import java.awt.*;

public class RailwayTicket extends JFrame {

    private JTextField nameField, ageField, cityField, destinationField;
    private JComboBox<String> genderBox, berthBox, classBox;

    public RailwayTicket() {
        setTitle("Railway Ticket Booking");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(25, 25, 50));

        JLabel title = new JLabel("🚆 Railway Ticket System", JLabel.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 26));
        title.setForeground(Color.WHITE);
        title.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        panel.add(title, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(8, 2, 12, 12));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        formPanel.setBackground(new Color(25, 25, 50));

        // Input fields
        JLabel nameLabel = createStyledLabel("Passenger Name:");
        nameField = new JTextField();

        JLabel ageLabel = createStyledLabel("Age:");
        ageField = new JTextField();

        JLabel genderLabel = createStyledLabel("Gender:");
        String[] genders = {"Male", "Female", "Other"};
        genderBox = new JComboBox<>(genders);

        JLabel cityLabel = createStyledLabel("City:");
        cityField = new JTextField();

        JLabel destLabel = createStyledLabel("Destination:");
        destinationField = new JTextField();

        JLabel berthLabel = createStyledLabel("Berth Preference:");
        String[] berths = {"Lower", "Middle", "Upper", "Side Lower", "Side Upper"};
        berthBox = new JComboBox<>(berths);

        JLabel classLabel = createStyledLabel("Class:");
        String[] classes = {"Sleeper", "AC 3 Tier", "AC 2 Tier", "First AC"};
        classBox = new JComboBox<>(classes);

        // Add to form
        formPanel.add(nameLabel); formPanel.add(nameField);
        formPanel.add(ageLabel); formPanel.add(ageField);
        formPanel.add(genderLabel); formPanel.add(genderBox);
        formPanel.add(cityLabel); formPanel.add(cityField);
        formPanel.add(destLabel); formPanel.add(destinationField);
        formPanel.add(berthLabel); formPanel.add(berthBox);
        formPanel.add(classLabel); formPanel.add(classBox);

        panel.add(formPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(new Color(25, 25, 50));

        JButton bookTicket = createStyledButton("Book Ticket");
        JButton ticketFare = createStyledButton("Get Fare Estimate");
        JButton exitButton = createStyledButton("Exit");

        buttonPanel.add(bookTicket);
        buttonPanel.add(ticketFare);
        buttonPanel.add(exitButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);
        add(panel);

        // Action listeners
        bookTicket.addActionListener(e -> bookTicket());
        ticketFare.addActionListener(e -> showFareEstimate());
        exitButton.addActionListener(e -> System.exit(0));
    }

    private JLabel createStyledLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(Color.WHITE);
        return label;
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setBackground(new Color(0, 153, 153));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return button;
    }

    // Book Ticket function
    private void bookTicket() {
        String name = nameField.getText();
        String age = ageField.getText();
        String gender = (String) genderBox.getSelectedItem();
        String city = cityField.getText();
        String destination = destinationField.getText();
        String berth = (String) berthBox.getSelectedItem();
        String seatClass = (String) classBox.getSelectedItem();

        JOptionPane.showMessageDialog(this,
                "🎟 Ticket Booked Successfully!\n\n" +
                        "Name: " + name +
                        "\nAge: " + age +
                        "\nGender: " + gender +
                        "\nFrom: " + city +
                        "\nTo: " + destination +
                        "\nBerth: " + berth +
                        "\nClass: " + seatClass,
                "Booking Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }

    // Fare Estimate function
    private void showFareEstimate() {
        String seatClass = (String) classBox.getSelectedItem();
        int baseFare = 200;

        switch (seatClass) {
            case "Sleeper": baseFare = 300; break;
            case "AC 3 Tier": baseFare = 700; break;
            case "AC 2 Tier": baseFare = 1200; break;
            case "First AC": baseFare = 2000; break;
        }

        JOptionPane.showMessageDialog(this,
                "💰 Estimated Fare for " + seatClass + " : ₹" + baseFare,
                "Fare Estimate", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RailwayTicket().setVisible(true);
        });
    }
}
