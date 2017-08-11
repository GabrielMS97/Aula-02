package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Janela extends JFrame {

    private final JLabel etiqueta;
    private final JLabel etiqueta2;

    public Janela() throws HeadlessException {
        super("Exemplo Janela");
        setLayout(new FlowLayout());
        Icon inconeUFJF = new ImageIcon("resources/ufjf.gif");
        etiqueta = new JLabel("Universidade Federal de Juiz de Fora");
        etiqueta.setIcon(inconeUFJF);
        etiqueta.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(etiqueta);

        etiqueta2 = new JLabel("Departamento de Ciência da Computação");
        add(etiqueta2);

    }
}
