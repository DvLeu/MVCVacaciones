package vision;

import javax.swing.*;

public class visionEspecialidad extends JFrame {
    private JPanel panelPrincipal;
    private JPanel pnlDatos1;
    public JTextField txtNombre;
    public JLabel lblNombre;
    private JPanel pnlDatos2;
    public JTextField txtID;
    public JLabel lblID;
    private JPanel pnlBotones;
    public JButton jbGuardar;
    public JButton jbSalir;

    public visionEspecialidad(){
        setTitle("Registro Especialidad");
        setContentPane(panelPrincipal);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



}
