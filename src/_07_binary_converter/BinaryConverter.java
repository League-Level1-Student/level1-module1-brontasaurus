package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	JFrame shield = new JFrame();
	JPanel stripe = new JPanel();
	JTextField star = new JTextField(20);
	JButton cap = new JButton("convert");
	JLabel murica = new JLabel();
	
BinaryConverter(){
	shield.add(stripe);
	stripe.add(star);
	stripe.add(cap);
	cap.addActionListener(this);
	shield.setVisible(true);
	shield.pack();
	
}
	
	
public static void main(String[] args) {
	
	BinaryConverter tazerface = new BinaryConverter();
	
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String answer = convert(star.getText());
	murica.setText(answer);
	shield.pack();
	System.out.println("atempt " + answer);
}
	
}
