import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator implements ActionListener{
	JFrame frame = new JFrame("Calculator");
	JButton buttons[] = new JButton[16];
	JPanel textFieldPanel;
	JButton sumButton;
	JButton subButton;
	JButton divButton;
	JButton mulButton;
	JButton sqrtButton;
	//JTextField textField;
	JLabel label;
	JLabel result;
	JPanel panel;
	static double  num1;
	static double  num2;
	String value;
	Calculator(){
		frame.getContentPane().setLayout(new BorderLayout());
		textFieldPanel = new JPanel(new GridLayout(2,0));
		label = new JLabel();
		label.setPreferredSize(new Dimension(200,20));
		result = new JLabel();
		result.setPreferredSize(new Dimension(200,20));
		textFieldPanel.add(label);
		textFieldPanel.add(result);
		frame.add(textFieldPanel, BorderLayout.NORTH);
		panel = new JPanel(new GridLayout(5,5));
		for(int i=0;i<10;i++){
			buttons[i] = new JButton(i+"");
			panel.add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		sumButton = new JButton("+");
		panel.add(sumButton);
		sumButton.addActionListener(this);
		subButton = new JButton("-");
		panel.add(subButton);
		subButton.addActionListener(this);
		mulButton = new JButton("*");
		panel.add(mulButton);
		mulButton.addActionListener(this);
		divButton = new JButton("/");
		panel.add(divButton);
		divButton.addActionListener(this);
		sqrtButton = new JButton("sqrt");
		panel.add(sqrtButton);
		sqrtButton.addActionListener(this);
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttons[0])
		{
			if(value!=null){
			value = label.getText() + "0";
			label.setText(value);
			}
			else {
				value = "0";
				label.setText(value);
			}
		}
		if(e.getSource()==buttons[1])
		{
			if(value!=null){
			value = label.getText() + "1";
			label.setText(value);
			}
			else {
				value = "1";
				label.setText(value);
			}
		}
		if(e.getSource()==buttons[2])
		{
			if(value!=null){
			value = label.getText() + "2";
			label.setText(value);
			}
			else {
				value = "2";
				label.setText(value);
			}
		}
		if(e.getSource()==buttons[3])
		{
			if(value!=null){
			value = label.getText() + "3";
			label.setText(value);
			}
			else {
				value = "3";
				label.setText(value);
			}
		}
		if(e.getSource()==buttons[4])
		{
			if(value!=null){
			value = label.getText() + "4";
			label.setText(value);
			}
			else {
				value = "4";
				label.setText(value);
			}
		}
		if(e.getSource()==buttons[5])
		{
			if(value!=null){
			value = label.getText() + "5";
			label.setText(value);
			}
			else {
				value = "5";
				label.setText(value);
			}
		}
		if(e.getSource()==buttons[6])
		{
			if(value!=null){
			value = label.getText() + "6";
			label.setText(value);
			}
			else {
				value = "6";
				label.setText(value);
			}
		}
		if(e.getSource()==buttons[7])
		{
			if(value!=null){
			value = label.getText() + "7";
			label.setText(value);
			}
			else {
				value = "7";
				label.setText(value);
			}
		}
		if(e.getSource()==buttons[8])
		{
			if(value!=null){
			value = label.getText() + "8";
			label.setText(value);
			}
			else {
				value = "8";
				label.setText(value);
			}
		}
		if(e.getSource()==buttons[9])
		{
			if(value!=null){
			value = label.getText() + "9";
			label.setText(value);
			}
			else {
				value = "9";
				label.setText(value);
			}
		}
		if(e.getSource()==sumButton){
			num1 = num1 + Double.parseDouble(label.getText());
			result.setText("=" + String.valueOf(num1));
			label.setText("");
		}
		if(e.getSource()==subButton){
			num1 = num1 - Double.parseDouble(label.getText());
			result.setText("=" + String.valueOf(num1));
			label.setText("");
		}
		if(e.getSource()==divButton){
			num1 = num1 / Double.parseDouble(label.getText());
			result.setText("=" + String.valueOf(num1));
			label.setText("");
		}
		if(e.getSource()==mulButton){
			num1 = num1 * Double.parseDouble(label.getText());
			result.setText("=" + String.valueOf(num1));
			label.setText("");
		}
		if(e.getSource()==sqrtButton){
			num1 = Math.sqrt(Double.parseDouble(label.getText()));
			result.setText("=" + String.valueOf(num1));
			label.setText("");
		}
		
	}
	public static void main(String []args){
		new Calculator();
	}
}
