package ru.gb.ilyashuk.homework8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame {
    private Double leftOperand;
    private String operation;

    public Calculator() {

        // По умолчанию открытые координаты x, y, положение и размер окна после открытия
        this.setBounds(30, 20, 500, 400);
        // Работа кнопки закрытия
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new BorderLayout());

        JLabel display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 20));


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String text = button.getText();
                String displayText = display.getText();
                String action = button.getText();
                Double rightOperand = Double.parseDouble(display.getText());

                System.out.println(text);

                if (("0123456789.").contains(text)) {
                    if (".".equals(text) && displayText.contains(".")) {
                        return;
                    }
                    if ("0".equals(displayText) && !".".equals(text)) {
                        displayText = "";
                    }
                    displayText += text;
                    display.setText(displayText);

                } else if ("+/-".equals(action)) {
                    display.setText(String.valueOf(0 - Double.parseDouble(display.getText())));
                } else if ("| |".equals(action)) {
                    display.setText(String.valueOf(Math.abs(Double.parseDouble(display.getText()))));


                } else {
                    if ("=".equals(action)) {
                        if (operation != null) {
                            switch (operation) {
                                case "+":
                                    display.setText((String.valueOf(leftOperand + rightOperand)));
                                    break;
                                case "-":
                                    display.setText((String.valueOf(leftOperand - rightOperand)));
                                    break;
                                case "*":
                                    display.setText((String.valueOf(leftOperand * rightOperand)));
                                    break;
                                case "/":
                                    display.setText((String.valueOf(leftOperand / rightOperand)));
                                    break;
                                case "%":
                                    display.setText((String.valueOf(leftOperand * rightOperand / 100)));
                                    break;
                            }
                            leftOperand = Double.parseDouble(display.getText());
                            operation = null;
                        }
                        return;
                    }
                    leftOperand = Double.parseDouble(display.getText());
                    operation = action;
                    display.setText("0");
                }

            }


        };


        JPanel numberPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] charArrayNumber = new String[]{"C", "| |", "%", "/", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "+/-", "0", ".", "="};

        for (String c : charArrayNumber) {
            JButton jButton = new JButton((c));
            numberPanel.add(jButton);
            jButton.addActionListener(listener);
        }

        container.add(display, BorderLayout.NORTH);
        container.add(numberPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String args[]) {
        // Инициализация объекта
         new Calculator();
    }
}