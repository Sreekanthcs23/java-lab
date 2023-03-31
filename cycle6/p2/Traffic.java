import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Traffic extends JFrame implements ActionListener
{

	Signals sg;
	
	Traffic()
	{
		initUI();
	}
	
	private void initUI()
	{
		
		sg = new Signals();
		JRadioButton red = new JRadioButton("Red");
		JRadioButton yellow = new JRadioButton("Yellow");
		JRadioButton green = new JRadioButton("Green");
		ButtonGroup b = new ButtonGroup();
		b.add(red);
		b.add(yellow);
		b.add(green);
		red.addActionListener(this);
		yellow.addActionListener(this);
		green.addActionListener(this);
		setLayout(new BorderLayout());
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout());
		buttons.add(red);
		buttons.add(yellow);
		buttons.add(green);
		add(buttons,BorderLayout.CENTER);
		
		add(sg,BorderLayout.NORTH);
		setResizable(false);
		setTitle("Traffic");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		if(s.equals("Red"))
		{
			sg.red = 1;
			sg.yellow = 0;
			sg.green = 0;
			sg.repaint();
			repaint();
		}
		if(s.equals("Yellow"))
		{
			sg.red = 0;
			sg.yellow = 1;
			sg.green = 0;
			sg.repaint();
			repaint();
		}
		if(s.equals("Green"))
		{
			sg.red = 0;
			sg.yellow = 0;
			sg.green = 1;
			sg.repaint();
			repaint();
		}
	}
	
	public static void main(String args[])
	{
		 SwingUtilities.invokeLater(new Runnable() {
                public void run()
                {
                    Traffic t = new Traffic();
                    t.setSize(400,400);
                    t.setVisible(true);
                }
        });
	}
}

class Signals extends JPanel
{
	int red=0;
	int yellow=0;
	int green=0;
	
	public void paintComponent(Graphics g)
	{
		g.drawOval(120,150,60,60);
		g.drawOval(120,230,60,60);
		g.drawOval(120,300,60,60);
		
		if(red==1)
		{
			g.setColor(Color.RED);
			g.fillOval(120,150,60,60);
			g.setColor(Color.WHITE);
			g.fillOval(120,230,60,60);
			g.setColor(Color.WHITE);
			g.fillOval(120,300,60,60);
		}
		
		if(yellow==1)
		{
			g.setColor(Color.WHITE);
			g.fillOval(120,150,50,50);
			g.setColor(Color.YELLOW);
			g.fillOval(120,230,50,50);
			g.setColor(Color.WHITE);
			g.fillOval(120,300,50,50);
		}
		
		if(green==1)
		{
			g.setColor(Color.WHITE);
			g.fillOval(120,150,50,50);
			g.setColor(Color.WHITE);
			g.fillOval(120,230,50,50);
			g.setColor(Color.GREEN);
			g.fillOval(120,300,50,50);
		}
	}
}












