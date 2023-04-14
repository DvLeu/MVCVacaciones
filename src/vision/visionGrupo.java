package vision;

import javax.swing.*;

public class visionGrupo extends JFrame{
    private JPanel panelPrincipal;
    private JPanel pnlDatos1;
    public JTextField txtClave;
    private JPanel pnlDatos2;
    public JLabel lblMateria;
    public JLabel lblClave;
    private JPanel pnlDatos3;
    public JLabel lblCatedratico;
    private JPanel pnlDatos4;
    public JLabel lblHora;
    public JTextField txtHora;
    private JPanel pnlDatos5;
    public JLabel lblSalon;
    public JTextField txtSalon;
    private JPanel pnlDatos6;
    public JLabel lblAlumno;
    public JPanel pnlBotones;
    public JButton jbGuardar;
    public JButton jbSalir;

    public visionGrupo(){
        setTitle("Registro Grupo");
        setContentPane(panelPrincipal);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
    }

}
