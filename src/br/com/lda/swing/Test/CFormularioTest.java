package br.com.lda.swing.Test;

import br.com.lda.swing.Classes.CBotaoAction;

import javax.swing.*;

public class CFormularioTest {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("Janela Principal");
        f.setSize(300, 200);
        f.setLocation(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        JLabel l = new JLabel("Digita seu nome: ");
        p.add(l);

        JTextField t = new JTextField(10);
        p.add(t);

        JButton b = new JButton("Ok");
        CBotaoAction action = new CBotaoAction(t);
        b.addActionListener(action);

        p.add(b);



        f.add(p);
        f.setVisible(true);

    }
}
