import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;

public class product {
    private JPanel Main;
    private JTextField txtName;
    private JTextField txtPrice;
    private JTextField txtQty;
    private JButton saveButton1;
    private JButton deleteButton1;
    private JButton updateButton;
    private JTextField txtpid;
    private JButton searchButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("product");
        frame.setContentPane(new product().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

