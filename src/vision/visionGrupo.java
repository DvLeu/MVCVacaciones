package vision;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class visionGrupo extends JFrame{
    private JPanel panelPrincipal;
    private JLabel lblClave;
    private JLabel lblMateria;
    private JLabel lblHora;
    public JTextField txtClave;
    private JTextField txtMateria;
    private JTextField txtCatedratico;
    public JTextField txtHora;
    private JLabel lblSalon;
    private JTextField txtAlumnos;
    public JTextField txtSalon;
    private JLabel lblAlumnos;
    public JButton jbGuardar;
    public JButton jbSalir;

    public visionGrupo(){
        setTitle("Registro Grupo");
        setContentPane(panelPrincipal);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(false);
        jbSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                visionMenu Menu= new visionMenu();
                Menu.setVisible(true);
                dispose();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
