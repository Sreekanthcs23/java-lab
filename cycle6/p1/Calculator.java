/*
	Roll no: B20CSB65
	Name: Sreekanth cs
	Name of Experiment: Simple Calculator  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener
{
	static JTextField inputBox;
	String s0,s1,s2;
	Calculator()
	{
		JFrame frame = new JFrame("Calculator");
		frame.setSize(280,280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		createUI(frame);
		s0="";
		s1="";
		s2="";
		
	}
	
	public void createUI(JFrame frame)
	{
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		JPanel p = new JPanel();
		p.setLayout(layout);
		
		inputBox = new JTextField(8);
		inputBox.setEditable(false);
		
		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnplus = new JButton("+");
		JButton btnminus = new JButton("-");
		JButton btnmultiply = new JButton("x");
		JButton btndivision = new JButton("/");
		JButton btnequal = new JButton("=");
		JButton btnclear = new JButton("C");
		JButton btndot = new JButton(".");
		
		gbc.insets = new Insets(10,0,10,0);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		p.add(btn1,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		p.add(btn2,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		p.add(btn3,gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 1;
		p.add(btnplus,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		p.add(btn4,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		p.add(btn5,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		p.add(btn6,gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 2;
		p.add(btnminus,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		p.add(btn7,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		p.add(btn8,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		p.add(btn9,gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 3;
		p.add(btnmultiply,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		p.add(btndot,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		p.add(btn0,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 4;
		p.add(btnequal,gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 4;
		p.add(btndivision,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		p.add(btnclear,gbc);
	
		p.setBackground(Color.BLUE);
		frame.add(p,BorderLayout.CENTER);
		frame.add(inputBox,BorderLayout.NORTH);
		
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnplus.addActionListener(this);
		btnminus.addActionListener(this);
		btnmultiply.addActionListener(this);
		btndivision.addActionListener(this);
		btnclear.addActionListener(this);
		btnequal.addActionListener(this);
		btndot.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		
		if((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.')
		{
			if(!(s1.equals("")))
				s2 = s2 + s;
			else
				s0 = s0 + s;
			inputBox.setText(s0+s1+s2);
		}
		
		else if(s.charAt(0) == 'C')
		{
			s0 = "";
			s1 = "";
			s2 = "";
			
			inputBox.setText(s0+s1+s2);
		}
		
		else if(s.charAt(0) == '=')
		{
			try
			{
				double res=0;
				if(s1.equals("+"))
					res = ((Double.parseDouble(s0)) + (Double.parseDouble(s2)));
				if(s1.equals("-"))
					res = ((Double.parseDouble(s0)) - (Double.parseDouble(s2)));
				if(s1.equals("/"))
				{
					if(s2.equals("0") || s2.equals("0.0"))
							throw new Exception();
					res = ((Double.parseDouble(s0)) / (Double.parseDouble(s2)));
				}
				if(s1.equals("x"))
					res = ((Double.parseDouble(s0)) * (Double.parseDouble(s2)));
				
				inputBox.setText(s0+s1+s2+" = "+res);
				s0 = Double.toString(res);
				s1 = "";
				s2 = "";
			}
			catch(Exception e)
			{
				s0 = "";
				s1 = "";
				s2 = "";
				inputBox.setText("Error");
			}
		}
		
		else
		{
			try
			{
				double res=0;
				if(s1.equals(""))
					s1 = s;
				else if(s2.equals(""))
					s2 = s;
				else
				{
					
					if(s1.equals("+"))
						res = ((Double.parseDouble(s0)) + (Double.parseDouble(s2)));
					if(s1.equals("-"))
						res = ((Double.parseDouble(s0)) - (Double.parseDouble(s2)));
					if(s1.equals("/"))
					{
						if(s2.equals("0") || s2.equals("0.0"))
							throw new Exception();
						res = ((Double.parseDouble(s0)) / (Double.parseDouble(s2)));
					}
					if(s1.equals("x"))
						res = ((Double.parseDouble(s0)) * (Double.parseDouble(s2)));
					
					s0 = Double.toString(res);
					s1 = s;
					s2 = "";
				}
				inputBox.setText(s0+s1+s2);
			}
			catch(Exception e)
			{
				s0 = "";
				s1 = "";
				s2 = "";
				inputBox.setText("Error");
			}	
		}
			
		
	}
	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run()
			{
				new Calculator();
			}
		});
	}
}












