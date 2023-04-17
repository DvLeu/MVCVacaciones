package controlador;

import vision.visionCatedratico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controladorCatedratico implements ActionListener {

    private final modeloCatedratico ModeloCatedratico;
    private final visionCatedratico VisionCatedratico;

    public controladorCatedratico(modeloCatedratico modeloCatedratico, visionCatedratico visionCatedratico){
        this.ModeloCatedratico = new modeloCatedratico();
        this.VisionCatedratico = new visionCatedratico();
        this.VisionCatedratico.setVisible(true);

        this.VisionCatedratico.jbGuardar.addActionListener(this);
        this.VisionCatedratico.jbSalir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VisionCatedratico.jbGuardar == e.getSource()){
            System.out.println("Nombre: "+VisionCatedratico.txtNombre.getText()+" RFC: "+VisionCatedratico.txtRFC.getText());
            JOptionPane.showMessageDialog(null, "Registro Guardado!","AVISO", JOptionPane.INFORMATION_MESSAGE);
            clear();
        }
        else if(VisionCatedratico.jbSalir == e.getSource()){
            Salir();
        }
    }

    public void clear(){
        VisionCatedratico.txtRFC.setText("");
        VisionCatedratico.txtNombre.setText("");
    }

    public void Salir(){
        VisionCatedratico.dispose();
    }

}
