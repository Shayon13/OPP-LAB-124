package calculatorproject;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
final class calculator implements ActionListener {
     
    public static void main(String[] args) 
    {
         calculator print = new calculator();
    }
     
    calculator()
    {
       UserInterface();
       SetComponents();
       SetActionEvent();
    }
    double number, answer;
    int calculation;
    JFrame frame=new JFrame();
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    
    //Create object for all number and symble 
    
    JRadioButton onButton = new JRadioButton("on");
    JRadioButton offButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
 
    // Method to prepare the GUI
     void  UserInterface() {
        frame.setTitle("Calculator");
        frame.setBounds(400, 150, 300, 500);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void SetComponents()
    {
       label.setBounds(100, 0, 90, 50);
       label.setText("CALCULATOR");
       label.setOpaque(true);
       label.setForeground(Color.BLACK);
       frame.add(label);
 
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setBackground(Color.GRAY);
        textField.setEditable(true);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
 
        onButton.setBounds(10, 95, 60, 40);
        onButton.setSelected(true);
        onButton.setFont(new Font("Arial", Font.BOLD, 14));
        onButton.setBackground(Color.GREEN);
        onButton.setForeground(Color.blue);
        frame.add(onButton);
 
        offButton.setBounds(10, 120, 60, 40);
        offButton.setSelected(false);
        offButton.setFont(new Font("Arial", Font.BOLD, 14));
        offButton.setBackground(Color.red);
        offButton.setForeground(Color.blue);
        frame.add(offButton);
 
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onButton);
        buttonGroup.add(offButton);
 
        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSeven.setBackground(Color.pink);
        buttonSeven.setForeground(Color.blue);
        frame.add(buttonSeven);
 
        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEight.setBackground(Color.pink);
        buttonEight.setForeground(Color.blue);
        frame.add(buttonEight);
 
        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.setBackground(Color.pink);
        buttonNine.setForeground(Color.blue);
        frame.add(buttonNine);
 
        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.setBackground(Color.pink);
        buttonFour.setForeground(Color.blue);
        frame.add(buttonFour);
 
        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.setBackground(Color.pink);
        buttonFive.setForeground(Color.blue);
        frame.add(buttonFive);
 
        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setBackground(Color.pink);
        buttonSix.setForeground(Color.blue);
        frame.add(buttonSix);
 
        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.setBackground(Color.pink);
        buttonOne.setForeground(Color.blue);
        frame.add(buttonOne);
 
        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.setBackground(Color.pink);
        buttonTwo.setForeground(Color.blue);
        frame.add(buttonTwo);
 
        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.setBackground(Color.pink);
        buttonThree.setForeground(Color.blue);
        frame.add(buttonThree);
 
        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setBackground(Color.pink);
        buttonDot.setForeground(Color.black);
        frame.add(buttonDot);
 
        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setBackground(Color.pink);
        buttonZero.setForeground(Color.blue);
        frame.add(buttonZero);
 
        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(Color.pink);
        buttonEqual.setForeground(Color.blue);
        frame.add(buttonEqual);
 
        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(Color.PINK);
        frame.add(buttonDiv);
 
        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setBackground(Color.PINK);
        frame.add(buttonSqrt);
 
        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(Color.PINK);
        frame.add(buttonMul);
 
        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(Color.PINK);
        frame.add(buttonMinus);
 
        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(Color.PINK);
        frame.add(buttonPlus);
 
        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setBackground(Color.PINK);
        frame.add(buttonSquare);
 
        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        buttonReciprocal.setBackground(Color.PINK);
        frame.add(buttonReciprocal);
 
        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.RED);
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);
 
        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.RED);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);  
    }
    // Method to add all the action listeners to the buttons
    void SetActionEvent() {
        onButton.addActionListener(this);
        offButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }
    
   // Method to add all the key listeners to the buttons and the frame
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
 
        // If the on radio button is selected, the calculator is enabled
        if (source == onButton) {
            enable();
        }
        // If the off radio button is selected, the calculator is disabled
        else if (source == offButton) {
            disable();
        }
        // If the clear button is pressed, the text field is cleared
        else if (source == buttonClear) {
            //label.setText("");
            textField.setText("");
        }
        // If the delete button is pressed, the last character is deleted
        else if (source == buttonDelete) {
            int length = textField.getText().length(); 
            int num = length - 1;
 
 
            if (length > 0) { // If the length is greater than 0, delete the last character
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(num);
                textField.setText(back.toString());
 
            }
        }
        else if (source == buttonZero) { // If the zero button is pressed, add a zero to the text field
            if (textField.getText().equals("0")) 
            { 
            } 
            else { 
                textField.setText(textField.getText() + "0");
                 }
        }
        // If the one button is pressed, add a one to the text field and so on for all the other buttons
        else if (source == buttonOne) {  
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
            } 
            else {
                textField.setText(textField.getText() + "."); 
            }
 
        }
        // If the plus button is pressed, add a plus to the text field and so on for all the buttons
        else if (source == buttonPlus) {
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            calculation = 1;
        } else if (source == buttonMinus) {
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            calculation = 2;
        } else if (source == buttonMul) {
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            calculation = 3;
        } else if (source == buttonDiv) {
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));
 
        } else if (source == buttonSquare) {
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEqual) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    break;
 
            }
        }
 
 
    }
 
    // method to enable the calculator
    public void enable() {
        onButton.setEnabled(false);
        offButton.setEnabled(true);
        textField.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
 
    }
 
    // method to disable the calculator
    public void disable() {
        onButton.setEnabled(true);
        offButton.setEnabled(false);
        textField.setText("");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }
}
