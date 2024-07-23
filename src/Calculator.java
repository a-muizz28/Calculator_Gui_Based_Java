import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Main class implementing ActionListener for handling events
public class Calculator implements ActionListener {

    // Declaring components and variables
    JFrame frame;
    JTextField textField;
    JButton[] number_buttons = new JButton[10];
    JButton[] function_buttons = new JButton[9];
    JButton add_button, sub_button, mul_button, div_button;
    JButton del_button, dec_button, clr_button, equ_button, neg_button;
    JPanel panel;

    Font myfont = new Font("Times New Roman", Font.PLAIN, 37);
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    // Constructor to set up the GUI
    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setBackground(Color.darkGray);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 70);
        textField.setFont(myfont);
        textField.setEditable(false); // Doesn't allow you to edit the text field manually
        textField.setBackground(Color.white);

        // Initializing function buttons
        add_button = new JButton("+");
        sub_button = new JButton("-");
        mul_button = new JButton("*");
        div_button = new JButton("/");
        clr_button = new JButton("Clr");
        del_button = new JButton("Del");
        equ_button = new JButton("=");
        dec_button = new JButton(".");
        neg_button = new JButton("Neg");

        // Adding function buttons to array
        function_buttons[0] = add_button;
        function_buttons[1] = sub_button;
        function_buttons[2] = div_button;
        function_buttons[3] = mul_button;
        function_buttons[4] = dec_button;
        function_buttons[5] = clr_button;
        function_buttons[6] = equ_button;
        function_buttons[7] = del_button;
        function_buttons[8] = neg_button;

        // Setting properties for function buttons
        for (int i = 0; i < 9; i++) {
            function_buttons[i].addActionListener(this);
            function_buttons[i].setFont(myfont);
            function_buttons[i].setFocusable(false); // Maintains focus on one rather than all
            function_buttons[i].setBackground(Color.YELLOW);
        }

        // Initializing and setting properties for number buttons
        for (int i = 0; i < 10; i++) {
            number_buttons[i] = new JButton(String.valueOf(i));
            number_buttons[i].addActionListener(this);
            number_buttons[i].setFont(myfont);
            number_buttons[i].setFocusable(false);
            number_buttons[i].setBackground(Color.BLACK);
            number_buttons[i].setForeground(Color.white); // Font color setting
        }

        // Setting bounds for special buttons
        del_button.setBounds(150, 430, 100, 50);
        clr_button.setBounds(250, 430, 100, 50);
        neg_button.setBounds(50, 430, 100, 50);

        // Creating and setting properties for panel
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.WHITE);

        // Adding components to the panel
        panel.add(number_buttons[0]);
        panel.add(number_buttons[1]);
        panel.add(number_buttons[2]);
        panel.add(add_button);
        panel.add(number_buttons[3]);
        panel.add(number_buttons[4]);
        panel.add(number_buttons[5]);
        panel.add(sub_button);
        panel.add(number_buttons[6]);
        panel.add(number_buttons[7]);
        panel.add(number_buttons[8]);
        panel.add(mul_button);
        panel.add(dec_button);
        panel.add(number_buttons[9]);
        panel.add(equ_button);
        panel.add(div_button);

        // Adding components to the frame
        frame.add(del_button);
        frame.add(clr_button);
        frame.add(neg_button);
        frame.add(textField);
        frame.add(panel);
        frame.setVisible(true);
        frame.setBackground(Color.DARK_GRAY);
    }

    // Main method
    public static void main(String[] args) {
        new Calculator();
    }

    // Action handler method
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handling number button presses
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == number_buttons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        // Handling decimal button press
        if (e.getSource() == dec_button) {
            textField.setText(textField.getText().concat("."));
        }
        // Handling operator button presses
        if (e.getSource() == add_button) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == sub_button) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mul_button) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == div_button) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        // Handling equals button press
        if (e.getSource() == equ_button) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        // Handling clear button press
        if (e.getSource() == clr_button) {
            textField.setText("");
        }
        // Handling delete button press
        if (e.getSource() == del_button) {
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length() - 1; i++) { // Deletes a single number from the right side each time pressed
                textField.setText(textField.getText() + string.charAt(i));
            }
        }
        // Handling negative button press
        if (e.getSource() == neg_button) {
            textField.setText(textField.getText().concat("-"));
        }
    }
}
