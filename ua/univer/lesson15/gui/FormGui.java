package ua.univer.lesson15.gui;

import javax.swing.*;
import java.awt.event.*;

public class FormGui {
    public static void main(String[] args) {
        JFrame win = new JFrame("first win");
        win.setSize(400, 500);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JTextField textField1 = new JTextField("                                  ");
        JTextField textField2 = new JTextField("                                  ");
        JTextField textField3 = new JTextField("                                  ");
        JButton btn1 = new JButton("+");
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = Integer.parseInt(textField1.getText().trim());
                int y = Integer.parseInt(textField2.getText().trim());
                textField3.setText(String.valueOf(x + y));
            }
        });
        JButton btn2 = new JButton("-");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(textField1.getText().trim());
                int y = Integer.parseInt(textField2.getText().trim());
                textField3.setText(String.valueOf(x - y));
            }
        });
        JButton btn3 = new JButton("list");
        btn3.addActionListener((e) -> {
                    new Thread(() -> {
                                    for (int i = 0; i < 100; i++) {
                                        textField3.setText(String.valueOf(i));
                                        try {
                                            Thread.sleep(20);
                                        } catch (InterruptedException ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                    }).start();


                }
        );
        panel.add(textField1);
        panel.add(textField2);
        panel.add(textField3);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        win.setContentPane(panel);
        win.setVisible(true);

    }
}
