package vision;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class visionCatedratico extends JFrame {
    private JPanel panelPrincipal;
    private JLabel lblNombre;
    private JLabel lblRFC;
    public  JTextField txtNombre;
    public  JTextField txtRFC;
    private JButton salirButton;
    public JButton jbGuardar;
    public  JButton jbSalir;

    public visionCatedratico(){
        setTitle("Registro Catedratico");
        setContentPane(panelPrincipal);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(false);
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                visionMenu Menu= new visionMenu();
                Menu.setVisible(true);
                dispose();
            }
        });
    }


}
