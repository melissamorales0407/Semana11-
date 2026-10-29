
import java.awt.*;
import javax.swing.*;

public class integer extends JFrame {

    public integer(){
        setTitle("Calculadora");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));
        JTextField txtNumero = new JTextField(12);
        JButton btnSumar = new JButton("Sumar 10");
        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setFont(new Font("Arial", Font.BOLD, 14));

        panel.add(lblResultado, BorderLayout.CENTER);
        panel.add(txtNumero, BorderLayout.EAST);
        panel.add(btnSumar,BorderLayout.SOUTH);

        add(panel);

    }
    
     public static void main(String[] args) {
     SwingUtilities.invokeLater(() ->  new integer().setVisible(true));
    }
}
