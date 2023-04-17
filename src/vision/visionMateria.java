package vision;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class visionMateria extends JFrame {
    private JPanel panelPrincipal;
    private JLabel lblNombre;
    public JTextField txtNombre;
    private JLabel lblID;
    public JTextField txtID;
    public JButton jbGuardar;
    public JButton jbSalir;

    public visionMateria(){
        setTitle("Registro Materia");
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
