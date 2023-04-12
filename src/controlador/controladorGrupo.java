package controlador;

import modelo.modeloGrupo;
import vision.visionGrupo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controladorGrupo implements ActionListener {

    private final modeloGrupo ModeloGrupo;
    private final visionGrupo VisionGrupo;

    public controladorGrupo(modeloGrupo ModeloGrupo, visionGrupo VisionGrupo){
        this.ModeloGrupo = new modeloGrupo();
        this.VisionGrupo = new visionGrupo();

        this.VisionGrupo.jbGuardar.addActionListener(this);
        this.VisionGrupo.jbSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VisionGrupo.jbGuardar == e.getSource()){
            System.out.println("Clave: "+VisionGrupo.txtClave.getText()+" Materia: "+ModeloGrupo.getMateria()+" Catedratico: "+ModeloGrupo.getCatedratico()+" Hora: "+Integer.parseInt(VisionGrupo.txtHora.getText())+" Salon"+ Integer.parseInt(VisionGrupo.txtSalon.getText())+" Alumno: "+ModeloGrupo.getAlumno());
            JOptionPane.showMessageDialog(null, "Registro Guardado!","AVISO", JOptionPane.INFORMATION_MESSAGE);
            clear();
        }
        else if(VisionGrupo.jbSalir == e.getSource()){
            Salir();
        }
    }

    public void clear(){
        VisionGrupo.txtClave.setText("");
        VisionGrupo.txtHora.setText("");
        VisionGrupo.txtSalon.setText("");
    }

    public void Salir(){
        System.exit(0);
    }

}
