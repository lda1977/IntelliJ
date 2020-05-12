package br.com.lda.swing.Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CBotaoAction implements ActionListener {

    private JTextField t;

    public CBotaoAction(JTextField t) {
        this.t = t;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String nome = t.getText();
        JOptionPane.showMessageDialog(null, "Foi digitado "+nome);

    }
}
