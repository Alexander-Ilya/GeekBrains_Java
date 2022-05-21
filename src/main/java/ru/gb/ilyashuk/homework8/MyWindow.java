package ru.gb.ilyashuk.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("BoxLayoutDemo");
        setBounds(1000, 1000, 500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            jButtons[i] = new JButton("Button " + (i + 1));
        }
        JLabel label = new JLabel("Label");
        TextField textField = new TextField("TextField"); //однострочное текстовое положительная
        //JTextArea многострочное
        //JRadioButton переключатель
        //JCheckBox

       // BoxLayout boxLayout = new BoxLayout(getContentPane(), BoxLayout.X_AXIS);
        LayoutManager gridLayout = new GridLayout(3, 3);
        //setLayout(boxLayout);
        setLayout(gridLayout);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                System.out.println(button.getText());
            }
        };
        for (JButton jButt :
                jButtons) {
            add(jButt);
            jButt.addActionListener(actionListener);
        }
        add(label);
        add(textField);
        System.out.println(textField.getText());
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
