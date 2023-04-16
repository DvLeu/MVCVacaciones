package vision;

import controlador.*;
import modelo.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class visionMenu extends JFrame {
    private JPanel panelPrincipal;
    private JPanel pnlMenus1;
    private JMenuBar barraMenu;
    private JMenu menuGuis;
    private JMenuItem itemEspecialidad;
    private JMenuItem itemCatedratico;
    private JMenuItem itemMateria;
    private JMenuItem itemAlumno;
    private JMenuItem itemGrupo;


    public visionMenu(){
        super("Menu de registros escolares");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        this.setJMenuBar(barraMenu);
        menuGuis.add(itemEspecialidad);
        menuGuis.add(itemCatedratico);
        menuGuis.add(itemMateria);
        menuGuis.add(itemAlumno);
        menuGuis.add(itemGrupo);
        barraMenu.add(menuGuis);

        itemEspecialidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                visionEspecialidad visionE = new visionEspecialidad();
                modeloEspecialidad modeloE = new modeloEspecialidad();
                new controladorEspecialidad(modeloE, visionE);
                setVisible(false);
            }
        });
        itemCatedratico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visionCatedratico visionC = new visionCatedratico();
                modeloCatedratico modeloC = new modeloCatedratico();
                new controladorCatedratico(modeloC, visionC);
                setVisible(false);
            }
        });
        itemMateria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visionMateria visionM = new visionMateria();
                modeloMateria modeloM = new modeloMateria();
                new controladorMateria(modeloM, visionM);
                setVisible(false);
            }
        });
        itemAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visionAlumno visionA = new visionAlumno();
                modeloAlumno modeloA = new modeloAlumno();
                new controladorAlumno(modeloA, visionA);
                setVisible(false);
            }
        });
        itemGrupo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visionGrupo visionG = new visionGrupo();
                modeloGrupo modeloG = new modeloGrupo();
                new controladorGrupo(modeloG, visionG);
                setVisible(false);
            }
        });
    }

}