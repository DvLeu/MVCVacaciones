package controlador;

import modelo.modeloEspecialidad;
import vision.visionEspecialidad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controladorEspecialidad implements ActionListener {

    private final modeloEspecialidad ModeloEspecialidad;
    private final visionEspecialidad VisionEspecialidad;

    public controladorEspecialidad(modeloEspecialidad ModeloEspecialidad, visionEspecialidad VisionEspecialidad){
        this.ModeloEspecialidad = new modeloEspecialidad();
        this.VisionEspecialidad = new visionEspecialidad();

        this.VisionEspecialidad.jbGuardar.addActionListener(this);
        this.VisionEspecialidad.jbSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VisionEspecialidad.jbGuardar == e.getSource()){
            System.out.println("Nombre: "+VisionEspecialidad.txtNombre.getText()+" ID:"+ Integer.parseInt(VisionEspecialidad.txtID.getText()));
            JOptionPane.showMessageDialog(null, "Registro Guardado!","AVISO", JOptionPane.INFORMATION_MESSAGE);
            clear();
        }
        else if(VisionEspecialidad.jbSalir == e.getSource()){
            Salir();
        }
    }

    public void clear(){
        VisionEspecialidad.txtID.setText("");
        VisionEspecialidad.txtNombre.setText("");
    }

    public void Salir(){
        VisionEspecialidad.dispose();
    }

}
