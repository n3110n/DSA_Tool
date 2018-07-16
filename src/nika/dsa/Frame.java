package nika.dsa;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Frame extends JFrame implements ActionListener {

    File file;

    public Frame(){

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        Container cp = this.getContentPane();

        cp.setLayout(new BorderLayout());

        JPanel location = new JPanel();
        location.setLayout(new BorderLayout());
        JPanel info = new JPanel();

        info.add(new JTextArea("hi"));


        JPanel tree = new JPanel();
        JTextArea filler = new JTextArea("Tree here later");
        filler.setSize(new Dimension (400,700));

        tree.add(filler);

        location.add(tree, BorderLayout.CENTER);

        JPanel directory = new JPanel();
        JLabel label_Path = new JLabel("Path:");
        JTextField path = new JTextField("Please select a path", 16);
        JButton setPath = new JButton("select");
        directory.add(label_Path);
        directory.add(path);
        directory.add(setPath);
        location.add(directory, BorderLayout.NORTH);

        JButton Chapter = new JButton("add Chapter");
        JButton SubChapter = new JButton ("add Subchapter");
        JPanel buttons = new JPanel();

        buttons.add(Chapter);
        buttons.add(SubChapter);

        location.add(buttons, BorderLayout.SOUTH);

        cp.add(location, BorderLayout.WEST);
        cp.add(info, BorderLayout.CENTER);

        this.setSize(d);

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Frame();
    }

}
