package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    double number1, number2, answer;
    char operator;
    JPanel panel = new JPanel();
    JTextField textField = new JTextField();
    JLabel label = new JLabel();

    JButton button_Minus = new JButton("-");
    JButton button_Plus = new JButton("+");
    JButton button_Division = new JButton("/");
    JButton button_Multiplication = new JButton("x");
    JButton button_Zero = new JButton("0");
    JButton button_One = new JButton("1");
    JButton button_Two = new JButton("2");
    JButton button_Three = new JButton("3");
    JButton button_Four = new JButton("4");
    JButton button_Five = new JButton("5");
    JButton button_six = new JButton("6");
    JButton button_Seven = new JButton("7");
    JButton button_Eight = new JButton("8");
    JButton button_Nine = new JButton("9");
    JButton button_Dot = new JButton(".");
    JButton button_Del = new JButton("Del");
    JButton button_Clear = new JButton("CE");
    JButton button_Equal = new JButton("=");
//    JButton button_Minus = new JButton("-");
//    JButton button_Plus = new JButton("+");
    Calculator() {

        frame();
        addComponents();
        addActionEvent();
    }

    void frame() {
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 480);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
    }
    void addComponents() {
        label.setBounds(100, 10, 375, 50);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("Arial", Font.PLAIN, 25));
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(label);


        textField.setBounds(30, 50, 440, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 28));
        textField.setBackground(Color.WHITE);
        textField.setBorder(BorderFactory.createEmptyBorder());
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(textField);

        //First Row
        button_Seven.setBounds(30, 110, 105, 40);
        button_Seven.setFont(new Font("Arial", Font.BOLD, 22));
        button_Seven.setFocusable(false);
        this.add(button_Seven);

        button_Eight.setBounds(140, 110, 105, 40);
        button_Eight.setFont(new Font("Arial", Font.BOLD, 22));
        button_Eight.setFocusable(false);
        this.add(button_Eight);

        button_Nine.setBounds(250, 110, 105, 40);
        button_Nine.setFont(new Font("Arial", Font.BOLD, 22));
        button_Nine.setFocusable(false);
        this.add(button_Nine);

        button_Division.setBounds(360, 110, 105, 40);
        button_Division.setFont(new Font("Arial", Font.BOLD, 22));
        button_Division.setFocusable(false);
        this.add(button_Division);

        // Second Row
        button_Four.setBounds(30, 160, 105, 40);
        button_Four.setFont(new Font("Arial", Font.BOLD, 22));
        button_Four.setFocusable(false);
        this.add(button_Four);

        button_Five.setBounds(135, 160, 105, 40);
        button_Five.setFont(new Font("Arial", Font.BOLD, 22));
        button_Five.setFocusable(false);
        this.add(button_Five);

        button_six.setBounds(245, 160, 105, 40);
        button_six.setFont(new Font("Arial", Font.BOLD, 22));
        button_six.setFocusable(false);
        this.add(button_six);

        button_Multiplication.setBounds(355, 160, 105, 40);
        button_Multiplication.setFont(new Font("Arial", Font.BOLD, 22));
        button_Multiplication.setFocusable(false);
        this.add(button_Multiplication);

        // Third Row
        button_One.setBounds(30, 210, 105, 40);
        button_One.setFont(new Font("Arial", Font.BOLD, 22));
        button_One.setFocusable(false);
        this.add(button_One);

        button_Two.setBounds(135, 210, 105, 40);
        button_Two.setFont(new Font("Arial", Font.BOLD, 22));
        button_Two.setFocusable(false);
        this.add(button_Two);

        button_Three.setBounds(245, 210, 105, 40);
        button_Three.setFont(new Font("Arial", Font.BOLD, 22));
        button_Three.setFocusable(false);
        this.add(button_Three);

        button_Plus.setBounds(355, 210, 105, 40);
        button_Plus.setFont(new Font("Arial", Font.BOLD, 22));
        button_Plus.setFocusable(false);
        this.add(button_Plus);

        // Fourth Row
        button_Zero.setBounds(30, 260, 105, 40);
        button_Zero.setFont(new Font("Arial", Font.BOLD, 22));
        button_Zero.setFocusable(false);
        this.add(button_Zero);

        button_Dot.setBounds(135, 260, 105, 40);
        button_Dot.setFont(new Font("Arial", Font.BOLD, 22));
        button_Dot.setFocusable(false);
        this.add(button_Dot);

        button_Equal.setBounds(245, 260, 105, 40);
        button_Equal.setFont(new Font("Arial", Font.BOLD, 22));
        button_Equal.setFocusable(false);
        this.add(button_Equal);

        button_Minus.setBounds(355, 260, 105, 40);
        button_Minus.setFont(new Font("Arial", Font.BOLD, 22));
        button_Minus.setFocusable(false);
        this.add(button_Minus);

        // Fifth Row
        button_Clear.setBounds(30, 310, 210, 40);
        button_Clear.setFont(new Font("Arial", Font.BOLD, 22));
        button_Clear.setFocusable(false);
        this.add(button_Clear);

        button_Del.setBounds(245, 310, 215, 40);
        button_Del.setFont(new Font("Arial", Font.BOLD, 22));
        button_Del.setFocusable(false);
        this.add(button_Del);

    }
    public void addActionEvent() {
        button_Minus.addActionListener(this);
        button_Plus.addActionListener(this);
        button_Division.addActionListener(this);
        button_Multiplication.addActionListener(this);
        button_Zero.addActionListener(this);
        button_One.addActionListener(this);
        button_Two.addActionListener(this);
        button_Three.addActionListener(this);
        button_Four.addActionListener(this);
        button_Five.addActionListener(this);
        button_six.addActionListener(this);
        button_Seven.addActionListener(this);
        button_Eight.addActionListener(this);
        button_Nine.addActionListener(this);
        button_Dot.addActionListener(this);
        button_Del.addActionListener(this);
        button_Clear.addActionListener(this);
        button_Equal.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if(ob == button_Clear) {
            label.setText("");
            textField.setText("");
        }
        else if(ob == button_Del) {
            int length = textField.getText().length();
            if(length > 0) {
                StringBuilder string = new StringBuilder(textField.getText());
                string.deleteCharAt(length - 1);
                textField.setText(string.toString());
            }
            if(textField.getText().endsWith("")) {
                label.setText("");
            }
        }
        else if(ob == button_Zero) {
            if(textField.getText().equals("0")) return;
            else
                textField.setText(textField.getText() + "0");
        }
        else if(ob == button_One) {
            textField.setText(textField.getText() + "1");
        }
        else if(ob == button_Two) {
            textField.setText(textField.getText() + "2");
        }
        else if(ob == button_Three) {
            textField.setText(textField.getText() + "3");
        }
        else if(ob == button_Four) {
            textField.setText(textField.getText() + "4");
        }
        else if(ob == button_Five) {
            textField.setText(textField.getText() + "5");
        }
        else if(ob == button_six) {
            textField.setText(textField.getText() + "6");
        }
        else if(ob == button_Seven) {
            textField.setText(textField.getText() + "7");
        }
        else if(ob == button_Eight) {
            textField.setText(textField.getText() + "8");
        }
        else if(ob == button_Nine) {
            textField.setText(textField.getText() + "9");
        }
        else if(ob == button_Dot) {
            if(textField.getText().contains(".")) return;
            else
                textField.setText(textField.getText() + ".");
        }
        else if(ob == button_Plus) {
            String str = textField.getText();
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            operator = '+';
        }
        else if(ob == button_Minus) {
            String str = textField.getText();
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            operator = '-';
        }
        else if(ob == button_Multiplication) {
            String str = textField.getText();
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "x");
            operator = 'x';
        }
        else if(ob == button_Division) {
            String str = textField.getText();
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            operator = '/';
        }
        else if(ob == button_Equal) {
            switch(operator) {
                case '+':
                    number2 = Double.parseDouble(textField.getText());
                    answer = number1 + number2;
                    if(Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    }
                    else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText(label.getText() + Double.toString(number2));
                        break;
                case '-':
                    number2 = Double.parseDouble(textField.getText());
                    answer = number1 - number2;
                    if(Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    }
                    else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText(label.getText() + Double.toString(number2));
                    break;
                case 'x':
                    number2 = Double.parseDouble(textField.getText());
                    answer = number1 * number2;
                    if(Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    }
                    else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText(label.getText() + Double.toString(number2));
                    break;
                case '/':
                    number2 = Double.parseDouble(textField.getText());
                    answer = number1 / number2;
                    if(Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    }
                    else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText(label.getText() + Double.toString(number2));
                    break;
            }
        }
    }
}
