package Lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static java.awt.BorderLayout.NORTH;

public class SecondWindow extends JFrame {
    public SecondWindow(){
        setTitle("Ввод данных");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setPreferredSize(new Dimension(400, 300));
        add(textPanel, NORTH);
        textPanel.setBackground(new Color(80, 78, 84));

        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.SOUTH);

        JButton jbtn = new JButton("Отправить данные");
        buttonPanel.add(jbtn);

        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.append(name1.getText() + "\n");
                jtf.setText("");
                jtf.grabFocus();
            }
        });

        JTextField name1 = new JTextField("Введите имя");
        textPanel.add(name1);

        JTextField surname = new JTextField("Введите фамилию");
        textPanel.add(surname);

        JTextField name2 = new JTextField("Введите отчество");
        textPanel.add(name2);

        Insets insets = textPanel.getInsets();
        Dimension size = name1.getPreferredSize();
        name1.setBounds(25 + insets.left, 50 + insets.top, size.width, size.height);
        size = surname.getPreferredSize();
        surname.setBounds(25 + insets.left, 100 + insets.top, size.width, size.height);
        size = name2.getPreferredSize();
        name2.setBounds(25 + insets.left, 150 + insets.top, size.width, size.height);
    }
}
