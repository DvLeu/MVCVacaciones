package controlador;

import modelo.modeloAlumno;
import vision.visionAlumno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controladorAlumno implements ActionListener {

    private final modeloAlumno ModeloAlumno;
    private final visionAlumno VisionAlumno;

    public controladorAlumno(modeloAlumno ModeloAlumno, visionAlumno VisionAlumno){
        this.ModeloAlumno = new modeloAlumno();
        this.VisionAlumno = new visionAlumno();
        this.VisionAlumno.setVisible(true);

        this.VisionAlumno.jbGuardar.addActionListener(this);
        this.VisionAlumno.jbSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VisionAlumno.jbGuardar == e.getSource()){
            System.out.println("Nombre: "+VisionAlumno.txtNombre.getText()+" Número de Control:"+ Integer.parseInt(VisionAlumno.txtNumControl.getText())+" Especialidad: "+ ModeloAlumno.getEspecialidad());
            JOptionPane.showMessageDialog(null, "Registro Guardado!","AVISO", JOptionPane.INFORMATION_MESSAGE);
            clear();
        }
        else if(VisionAlumno.jbSalir == e.getSource()){
            Salir();
        }
    }

    public void clear(){
        VisionAlumno.txtNombre.setText("");
        VisionAlumno.txtNumControl.setText("");
    }

    public void Salir(){
        VisionAlumno.dispose();
    }

}
