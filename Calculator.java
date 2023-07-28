/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField display;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    private JButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonEquals, buttonClear;
    private double firstNumber, secondNumber, result;
    private String operator;

    public Calculator() {
        setTitle("Calculator");
        setSize(240, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize GUI components
        display = new JTextField(10);
        display.setEditable(false);
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEquals = new JButton("=");
        buttonClear = new JButton("C");

        // Add GUI components to JFrame
        JPanel panel1 = new JPanel(new GridLayout(4, 3));
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(button0);
        panel1.add(buttonClear);
        panel1.add(buttonEquals);

        JPanel panel2 = new JPanel(new GridLayout(1, 4));
        panel2.add(buttonPlus);
        panel2.add(buttonMinus);
        panel2.add(buttonMultiply);
        panel2.add(buttonDivide);

        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.add(display, BorderLayout.NORTH);
        panel3.add(panel1, BorderLayout.CENTER);
        panel3.add(panel2, BorderLayout.EAST);

        setContentPane(panel3);
        setVisible(true);

        // Attach action listeners
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonClear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            display.setText(display.getText() + "1");
        } else if (e.getSource() == button2) {
            display.setText(display.getText() + "2");
        } else if (e.getSource() == button3) {
            display.setText(display.getText() + "3");
        } else if (e.getSource() == button4) {
            display.setText(display.getText() + "4");
        } else if (e.getSource() == button5) {
            display.setText(display.getText() + "5");
        } else if (e.getSource() == button6) {
            display.setText(display.getText() + "6");
        } else if (e.getSource() == button7) {
            display.setText(display.getText() + "7");
        } else if (e.getSource() == button8) {
            display.setText(display.getText() + "8");
        } else if (e.getSource() == button9) {
            display.setText(display.getText() + "9");
        } else if (e.getSource() == button0) {
            display.setText(display.getText() + "0");
        } else if (e.getSource() == buttonPlus) {
            firstNumber = Double.parseDouble(display.getText());
            operator = "+";
            display.setText("");
        } else if (e.getSource() == buttonMinus) {
            firstNumber = Double.parseDouble(display.getText());
            operator = "-";
            display.setText("");
        } else if (e.getSource() == buttonMultiply) {
            firstNumber = Double.parseDouble(display.getText());
            operator = "*";
            display.setText("");
        } else if (e.getSource() == buttonDivide) {
            firstNumber = Double.parseDouble(display.getText());
            operator = "/";
            display.setText("");
        } else if (e.getSource() == buttonEquals) {
            secondNumber = Double.parseDouble(display.getText());
            if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            } else if (operator.equals("-")) {
                result = firstNumber - secondNumber;
            } else if (operator.equals("*")) {
                result = firstNumber * secondNumber;
            } else if (operator.equals("/")) {
                result = firstNumber / secondNumber;
            }
            display.setText(String.valueOf(result));
        } else if (e.getSource() == buttonClear) {
            display.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator();
            }
        });
    }
}

            
       

