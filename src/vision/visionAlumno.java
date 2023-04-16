package vision;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class visionAlumno extends JFrame {
    private JPanel panelPrincipal;
    public JTextField txtNombre;
    public JLabel lblNombre;
    public JTextField txtNumControl;
    public JLabel lblNumControl;
    public JLabel lblEspecialidad;
    public JButton jbGuardar;
    public JButton jbSalir;
    private JTextField txtEspecialidad;

    public visionAlumno(){
        setTitle("Registro Alumno");
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

}
