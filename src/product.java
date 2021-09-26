import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;

public class product {
    private JPanel Main;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton saveButton1;
    private JButton deleteButton1;
    private JButton updateButton;
    private JTextField textField4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("product");
        frame.setContentPane(new product().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public product() {
        connect();
        saveButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        saveButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
       Connection con;
       PreparedStatement pst;
    public void connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/gbproducts", "root", "");
            System.out.println("Success");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }




}
