package multibus;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simulation extends JPanel{
	static JFrame jf;
	private JButton bu1,bu2;
	private JLabel l1,l2;
	public void inter()
	{
		jf=new JFrame();
		jf.setSize(800,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBackground(Color.white);
		jf.setLayout(null);
		bu1=new JButton("ADD R4,R5,R6");
		bu2=new JButton("MOV (R2),R1");
		l1=new JLabel("Welcome to Multiple Bus Architecture Simulation");
		l2=new JLabel("Select an option to view the control sequence simulation");
		bu1.setBounds(250, 170,200,20);
		bu2.setBounds(250, 220,200,20);
		l1.setFont(new Font("Times New Roman",Font.PLAIN,25));
		l2.setFont(new Font("Serif",Font.PLAIN,20));
		l1.setBounds(120,20,600,50);
		l2.setBounds(150,90,500,50);
		jf.add(bu1);
		jf.add(bu2);
		jf.add(l1);
		jf.add(l2);
		thehandler handler=new thehandler();
		bu1.addActionListener(handler);
		bu2.addActionListener(handler);
	}
public static void main(String args[])
{
	simulation s = new simulation();
	s.inter();
}

private class thehandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bu1)
		{
			Packet p=new Packet();
			jf=new JFrame();
			jf.setSize(1000,700);
			jf.setVisible(true);
			jf.add(p);
		}
		if(e.getSource()==bu2)
		{
			Packet_move pm=new Packet_move();
			jf=new JFrame();
			jf.setSize(1000,700);
			jf.setVisible(true);
			jf.add(pm);
		}
	}
}
}
