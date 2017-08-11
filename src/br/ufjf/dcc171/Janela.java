package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {

    private final JLabel etiqueta;
    private final JLabel etiqueta2;

    public Janela() throws HeadlessException {
        super("Exemplo Janela");
        setLayout(new FlowLayout());
        etiqueta = new JLabel("Universidade Federal de Juiz de Fora");
        add(etiqueta);

        etiqueta2 = new JLabel("Departamento de Ciência da Computação");
        add(etiqueta2);

    }
}
