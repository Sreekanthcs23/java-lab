import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Signals extends JPanel
{
	int red=1;
	int yellow=0;
	int green=0;
	
	public void paintComponent(Graphics g)
	{
		g.drawOval(120,150,50,50);
		g.drawOval(120,230,50,50);
		g.drawOval(120,300,50,50);
		
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

class test extends JFrame
{
	Signals sg = new Signals();
	test()
	{
		setSize(400,400);
		add(sg);
		setVisible(true);
		setTitle("Traffic");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		 SwingUtilities.invokeLater(new Runnable() {
                public void run()
                {
                    test t = new test();
                }
        });
	}
}















