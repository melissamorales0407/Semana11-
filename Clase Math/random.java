
import java.awt.Font;

import javax.swing.*;

public class random extends JFrame{


    public random(){

        setTitle("Dado");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton btnDado = new JButton("Lanzar Dado");
        JLabel lblAleatorio = new JLabel("DADO");
        lblAleatorio.setFont(new Font("Arial", Font.BOLD, 45));
        

        panel.add(lblAleatorio);
        panel.add(btnDado);
    

        add(panel);

         
        

        btnDado.addActionListener(e -> {
        int dado = (int)(Math.random() * 6) + 1;
        lblAleatorio.setText(String.valueOf(dado));
     });
        
      

    }

    public static void main(String[] args) {
     SwingUtilities.invokeLater(() ->  new random().setVisible(true));
    }
}