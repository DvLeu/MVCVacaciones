package vision;

import javax.swing.*;

public class visionAlumno extends JFrame {
    private JPanel panelPrincipal;
    private JPanel pnlDatos1;
    public JTextField txtNombre;
    private JPanel pnlDatos2;
    public JLabel lblNombre;
    public JTextField txtNumControl;
    public JLabel lblNumControl;
    private JPanel pnlDatos3;
    public JLabel lblEspecialidad;
    private JPanel pnlBotones;
    public JButton jbGuardar;
    public JButton jbSalir;

    public visionAlumno(){
        setTitle("Registro Alumno");
        setContentPane(panelPrincipal);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
