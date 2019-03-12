package Lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.*;


public class MyWindow extends JFrame {
    public String str;

    public MyWindow() {
        setTitle("Данные человека");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setPreferredSize(new Dimension(400, 300));
        add(textPanel, NORTH);
        textPanel.setBackground(new Color(80, 78, 84));

        JPanel buttonPanel = new JPanel();
        add(buttonPanel, SOUTH);

        JButton jbtn1 = new JButton("Ввести значение");
        buttonPanel.add(jbtn1);

        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondWindow secondWindow = new SecondWindow();
            }
        });

        JTextField name = new JTextField("Имя");
        textPanel.add(name);
        name.setEditable(false);


        JTextField surname = new JTextField("Фамилия");
        textPanel.add(surname);
        surname.setEditable(false);

        JTextField name2 = new JTextField("Отчество");
        textPanel.add(name2);
        name2.setEditable(false);

        Insets insets = textPanel.getInsets();
        Dimension size = name.getPreferredSize();
        name.setBounds(25 + insets.left, 50 + insets.top, size.width, size.height);
        size = surname.getPreferredSize();
        surname.setBounds(25 + insets.left, 100 + insets.top, size.width, size.height);
        size = name2.getPreferredSize();
        name2.setBounds(25 + insets.left, 150 + insets.top, size.width, size.height);

    }
}
