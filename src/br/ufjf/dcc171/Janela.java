package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {

    public Janela() throws HeadlessException {
        super("Exemplo Janela");
        setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Universidade Federal de Juiz de Fora");
        add(etiqueta);
        
        JLabel etiqueta2 = new JLabel("Departamento de Ciência da Computação");        
        add(etiqueta2);
        
    }
}
