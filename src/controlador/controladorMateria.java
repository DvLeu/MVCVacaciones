package controlador;

import modelo.modeloMateria;
import vision.visionMateria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controladorMateria implements ActionListener {

    private final modeloMateria ModeloMateria;
    private final visionMateria VisionMateria;

    public controladorMateria(modeloMateria ModeloMateria, visionMateria VisionMateria){
        this.ModeloMateria = new modeloMateria();
        this.VisionMateria = new visionMateria();

        this.VisionMateria.jbGuardar.addActionListener(this);
        this.VisionMateria.jbSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VisionMateria.jbGuardar == e.getSource()){
            System.out.println("Nombre: "+VisionMateria.txtNombre.getText()+" ID:"+ Integer.parseInt(VisionMateria.txtID.getText()));
            JOptionPane.showMessageDialog(null, "Registro Guardado!","AVISO", JOptionPane.INFORMATION_MESSAGE);
            clear();
        }
        else if(VisionMateria.jbSalir == e.getSource()){
            Salir();
        }
    }

    public void clear(){
        VisionMateria.txtID.setText("");
        VisionMateria.txtNombre.setText("");
    }

    public void Salir(){
        VisionMateria.dispose();
    }


}
