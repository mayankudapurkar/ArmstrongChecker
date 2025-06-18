import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ArmstrongChecker implements ActionListener{
    
    JFrame frame = new JFrame("Armstrong Number Checker");
    JLabel instructionLabel = new JLabel("Enter a number:",SwingConstants.CENTER);
    JTextField input = new JTextField();
    JLabel resultLabel = new JLabel("",SwingConstants.CENTER);
    JButton checkButton = new JButton("Check");

    ArmstrongChecker() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 125);
        frame.setLayout(new GridLayout(2, 2));

        checkButton.addActionListener(this);

        frame.add(instructionLabel);
        frame.add(input);
        frame.add(checkButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
    
    public  boolean isArmstrong(){

        String numstr = input.getText().trim();
        int number = Integer.parseInt(numstr);
        int digits = numstr.length();
        int original = number, sum = 0 ; 

        while(number!=0){
             int digit=number%10;
             sum += Math.pow(digit,digits);
             number = number/10;
        }

        return (sum==original);
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {

         try {
            if (isArmstrong()) {
                resultLabel.setForeground(new Color(0, 128, 0));
                resultLabel.setText("It is an Armstrong Number");
            } else {
                resultLabel.setForeground(Color.RED);
                resultLabel.setText("It is NOT an Armstrong Number");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setForeground(Color.RED);
            resultLabel.setText("Invalid input! Enter an integer.");
        }

    }
}

public class Task2{
    public static void main(String[] args) {
        new ArmstrongChecker();
    }
}
