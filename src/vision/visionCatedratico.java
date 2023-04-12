package vision;

import javax.swing.*;
import java.awt.*;

public class visionCatedratico extends JFrame {
    private JPanel panelPrincipal;
    private JPanel pnlDatos1;
    public  JTextField txtNombre;
    public JLabel lblNombre;
    private JPanel pnlDatos2;
    public  JTextField txtRFC;
    public JLabel lblRFC;
    private JPanel pnlBotones;
    public JButton jbGuardar;
    public  JButton jbSalir;

    public visionCatedratico(){
        setTitle("Registro Catedratico");
        setContentPane(panelPrincipal);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
