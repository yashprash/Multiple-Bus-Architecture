package multibus;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sun.audio.*;
import java.io.*;
class Comp extends JPanel {

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		g.setColor(Color.black);
		g.drawRect(590,25,90,25);
		g.drawString("Incrementor",602,40);
		int x1[]={630,627,631,635,632,632,630};
		int y1[]={56,56,50,56,56,65,65};
		g.fillPolygon(x1,y1,7);
		int x2[]={665,662,666,670,667,667,665};
		int y2[]={61,61,65,61,61,50,50};
		g.fillPolygon(x2,y2,7);
		g.drawRect(590,65,90,25);
		g.drawString("PC", 622, 82);
		g.drawRect(590, 115, 90, 50);
		g.drawString("Register File",600,140);
		g.drawRect(590, 340, 90, 40);
		g.drawString("Instruction", 605, 355);
		g.drawString("decoder", 610, 370);
		int x3[]={630,627,631,635,632,632,630};
		int y3[]={385,385,380,385,385,400,400};
		g.fillPolygon(x3,y3,7);
		g.drawRect(590, 400, 90, 25);
		g.drawString("IR", 625, 417);
		g.drawRect(590,450,90,25);
		g.drawString("MDR", 620, 465);
		g.drawRect(590, 510, 90, 30);
		g.drawString("MAR", 620, 528);
		int a[]= {530,530,560,560};
		int b[]= {205,275,260,220};
		g.drawPolygon(a, b, 4);
		g.drawString("MUX", 532, 245);
		int x11[]= {590,590,680,680};
		int y11[]= {220,310,295,235};
		g.drawPolygon(x11,y11,4);
		g.drawString("A", 595, 240);
		g.drawString("B",595, 300);
		g.drawString("ALU", 620, 270);
		g.drawString("R", 670,270);
		g.drawString("Constant 4", 470, 200);
		g.drawString("Memory bus",500,580);
		g.drawString("data lines", 505, 595);
		g.drawString("Address lines", 600, 590);
		int x4[]={635,632,636,640,637,637,635};
		int y4[]={570,570,580,570,570,540,540};
		g.fillPolygon(x4, y4, 7);
		int x5[]={635,632,636,640,637,637,530,530,533,529,525,528,528,635};
		int y5[]={480,480,475,480,480,500,500,565,565,570,565,565,498,498};
		g.fillPolygon(x5, y5, 14);
		int x6[]= {590,590,450,450,440,450,450};
		int y6[]= {77,79,79,82,78,74,77};
		g.fillPolygon(x6, y6, 7);
		int x7[]= {750,750,690,690,680,690,690};
		int y7[]= {77,79,79,82,78,74,77};
		g.fillPolygon(x7, y7, 7);
		int x8[]= {750,750,690,690,680,690,690};
		int y8[]= {139,141,141,144,140,135,139};
		g.fillPolygon(x8, y8, 7);
		int x9[]= {590,590,450,450,440,450,450};
		int y9[]= {131,133,133,136,132,128,131};
		g.fillPolygon(x9, y9, 7);
		int x10[]= {590,590,370,370,360,370,370};
		int y10[]= {148,150,150,153,149,145,148};
		g.fillPolygon(x10, y10, 7);
		int x12[]= {440,440,580,580,590,580,580};
		int y12[]= {298,300,300,303,299,295,298};
		g.fillPolygon(x12, y12, 7);
		int x13[]= {560,560,580,580,590,580,580};
		int y13[]= {238,240,240,243,239,235,238};
		g.fillPolygon(x13, y13, 7);
		int x14[]= {490,490,520,520,530,520,520};
		int y14[]= {223,225,225,228,224,220,223};
		g.fillPolygon(x14, y14, 7);
		int x16[]= {490,492,492,490};
		int y16[]= {223,223,200,200};
		g.fillPolygon(x16, y16, 4);
		int x15[]= {360,360,520,520,530,520,520};
		int y15[]= {258,260,260,263,259,255,258};
		g.fillPolygon(x15, y15, 7);
		
		int x17[]= {590,590,450,450,440,450,450};
		int y17[]= {455,457,457,460,456,452,455};
		g.fillPolygon(x17, y17, 7);
		int x18[]= {590,590,370,370,360,370,370};
		int y18[]= {470,472,472,475,471,467,470};
		g.fillPolygon(x18, y18, 7);
		
		int x19[]= {750,750,690,690,680,690,690};
		int y19[]= {464,466,466,469,465,461,464};
		g.fillPolygon(x19, y19, 7);
		int x20[]= {750,750,690,690,680,690,690};
		int y20[]= {414,416,416,419,415,411,414};
		g.fillPolygon(x20, y20, 7);
		int x22[]= {750,750,690,690,680,690,690};
		int y22[]= {524,526,526,529,525,521,524};
		g.fillPolygon(x22, y22, 7);
		int x23[]= {680,680,740,740,750,740,740};
		int y23[]= {266,268,268,271,267,263,266};
		g.fillPolygon(x23, y23, 7);
		int x21[]= {590,590,370,370,360,370,370};
		int y21[]= {360,362,362,365,361,357,360};
		g.fillPolygon(x21, y21, 7);
		
		g.drawString("Bus A", 340, 15);
		g.drawString("Bus B", 420, 15);
		g.drawString("Bus C", 740, 15);
		g.setColor(Color.blue);
		int a1[]= {350,345,355,365,360,360,365,355,345,350};
		int a2[]= {30,30,20,30,30,550,550,560,550,550};
		g.fillPolygon(a1, a2, 10);
		int b1[]= {430,425,435,445,440,440,445,435,425,430};
		int b2[]= {30,30,20,30,30,550,550,560,550,550};
		g.fillPolygon(b1, b2, 10);
		int c1[]= {750,745,755,765,760,760,765,755,745,750};
		int c2[]= {30,30,20,30,30,550,550,560,550,550};
		g.fillPolygon(c1, c2, 10);
	}
}
public class Packet extends Comp implements ActionListener{
	//Thread curr=Thread.currentThread();
	Timer t=new Timer(10,this);
	Timer t1=new Timer(15000,this);
	int x=590,y=73,c=1200,d=900,vel=1,flag=-1,pause=0,done=-2,step=0;
	public void music()
	{
		t1.start();
		if(step==1)
		{
			try {
				InputStream in = new FileInputStream("Step1.wav");
				AudioStream as = new AudioStream(in);         
				AudioPlayer.player.start(as);             
			}
			catch(Exception e) {}
		}
		else if(step==2)
		{
			try {
				InputStream in = new FileInputStream("Step2.wav");
				AudioStream as = new AudioStream(in);         
				AudioPlayer.player.start(as);            
				}
				catch(Exception e) {}
		}
		else if(step==3)
		{
			try {
				InputStream in = new FileInputStream("Step3.wav");
				AudioStream as = new AudioStream(in);         
				AudioPlayer.player.start(as);            
				}
				catch(Exception e) {}
		}
		else if(step==4)
		{
			try {
				InputStream in = new FileInputStream("Step4.wav");
				AudioStream as = new AudioStream(in);         
				AudioPlayer.player.start(as);            
				}
				catch(Exception e) {}
		}
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(pause==1)
		{
			pause=0;
			done++;
			music();
		}
		if(flag==-1)
		{
			g.setColor(Color.RED);
			g.fillOval(x, y, 10,10);
			g.fillOval(c,d,10,10);
			t.start();
		}
		else if(flag==0 |  flag==1 | flag==2 |flag==3)
		{
			g.setColor(Color.RED);
			g.fillOval(x, y, 10,10);
			g.fillOval(c,d,10,10);
		}
		else if(flag==4 | flag==5)
		{
			g.setColor(Color.GREEN);
			g.fillOval(x, y, 10,10);
			g.fillOval(c,d,10,10);
		
		}
		if(flag==-1 | flag==0 | flag==1)
		{
			g.setFont(new Font("TimesRoman",Font.BOLD,18));
			g.setColor(Color.BLACK);
			g.drawString("Control Sequence:",40,400);
			g.drawString("1. PCout,R=B,MARin,READ,IncPC",25,430);
		}
		else if(flag==2)
		{
			g.setFont(new Font("TimesRoman",Font.BOLD,18));
			g.setColor(Color.BLACK);
			g.drawString("Control Sequence:",40,400);
			g.drawString("1. PCout,R=B,MARin,READ,IncPC",25,430);
			g.drawString("2. WMFC",25,460);
		}
		else if(flag==3)
		{
			g.setFont(new Font("TimesRoman",Font.BOLD,18));
			g.setColor(Color.BLACK);
			g.drawString("Control Sequence:",40,400);
			g.drawString("1. PCout,R=B,MARin,READ,IncPC",25,430);
			g.drawString("2. WMFC",25,460);
			g.drawString("3. MDRoutb,R=B,IRin",25,490);
		}
		else if(flag==4)
		{
			g.setFont(new Font("TimesRoman",Font.BOLD,18));
			g.setColor(Color.BLACK);
			g.drawString("Control Sequence:",40,400);
			g.drawString("1. PCout,R=B,MARin,READ,IncPC",25,430);
			g.drawString("2. WMFC",25,460);
			g.drawString("3. MDRoutb,R=B,IRin",25,490);
			g.drawString("4. R4outa,R5outb,SelectA,Add,R6in,END",25,520);
		}
		else if(flag==5)
		{
			t.stop();
			g.setFont(new Font("TimesRoman",Font.BOLD,18));
			g.setColor(Color.BLACK);
			g.drawString("Control Sequence:",40,400);
			g.drawString("1. PCout,R=B,MARin,READ,IncPC",25,430);
			g.drawString("2. WMFC",25,460);
			g.drawString("3. MDRoutb,R=B,IRin",25,490);
			g.drawString("4. R4outa,R5outb,SelectA,Add,R6in,END",25,520);
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(flag==-1| flag==0 | flag==1 | flag==2 | flag==3)
		{
		
		if(x>428 & x<=590 & y==73)
		{
			if(done==-2)
			{
				pause=1;
				step=1;
				t.stop();
			}
			if(done==-1)
			{
				done=0;
				t1.stop();
				t.start();
			}
			flag=0;
			x = x-vel;
			repaint();
		}
		else if(y<295 & x==428 & flag==0)
		{
			y=y+vel;
			repaint();
		}
		//R=B
		else if(x<600 & y==295 & flag==0)
		{
			x = x +vel;
			repaint();
		}
		else if(x==600 & y>265 & flag==0)
		{
			y=y-vel;
			repaint();
		}
		else if(y==265 & x<750 & flag==0)
		{
			x=x+vel;
			repaint();
		}
		//IncPC
		else if(x==750 & y>75 & y<266 & flag==0)
		{
			y=y-vel;
			repaint();
		}
		else if(y==75 & x>628 & flag==0)
		{
			x=x-vel;
			repaint();
		}
		else if(x==628 & y>40 & y<76)
		{
			flag=1;
			y=y-vel;
			repaint();
		}
		else if(y==40 & x<665 & flag==1)
		{
			x=x+vel;
			repaint();
		}
		else if(x==665 & y<72 & flag==1)
		{
			y=y+vel;
			repaint();
		}
		else if(y==72 & x<755 & flag==1)
		{
			x=x+vel;
			repaint();
			
		}
		//MARin
		else if(x==755 & y<520)
		{
			y=y+vel;
			repaint();
		}
		else if(y==520 & x>630)
		{
			if(x==755 & y==520 & done==0)
			{
				pause=1;
				step=2;
				t.stop();
			}
			if(done==1)
			{
				done=2;
				t1.stop();
				t.start();
			}
			flag=2;
			x=x-vel;
			repaint();
		}
		//WMFC
		else if(x==630 & y<620 & y>519 & flag==2)
		{
			
			y=y+vel;
			repaint();
		}
		else if(y==620 & x>520 & flag==2)
		{
			x=x-vel;
			repaint();
		}
		else if(x==520 & y>495 & flag==2)
		{
			y=y-vel;
			repaint();
		}
		else if(y==495 & x<628 & flag==2)
		{
			x=x+vel;
			repaint();
		}
		else if(x==628 & y>445)
		{
			if(x==628 & y==495 & done==2)
			{
				pause=1;
				step=3;
				t.stop();
			}
			if(done==3)
			{
				done=4;
				t1.stop();
				t.start();
			}
			flag=3;
			y=y-vel;
			repaint();
		}
		//MRDoutb
		else if(y==445 & x>427 & flag==3)
		{
			x=x-vel;
			repaint();
		}
		else if(x==427 & y>297 & flag==3)
		{
			y=y-vel;
			repaint();
		}
		//R=B
		else if(x<600 & y==297 & flag==3)
		{
			x = x +vel;
			repaint();
		}
		else if(x==600 & y>265 & flag==3)
		{
			y=y-vel;
			repaint();
		}
		else if(y==265 & x<753 & flag==3)
		{
			x=x+vel;
			repaint();
		}
		else if(x==753 & y<410 & y>264  & flag==3)
		{
			y=y+vel;
			repaint();
			
		}
		else if(y==410 & x>640 & flag==3)
		{
			x=x-vel;
			repaint();
		}
		else
			flag=4;
		}
	else
		{
			//R4outa,R5outb
		if(x==640 & y==410)
		{
			x=620;
			c=620;
			y=145;
			d=130;
			flag=4;
			repaint();
		}
		else if(y==145 & d==130 & x>350)
		{
			if(done==4)
			{
				pause=1;
				step=4;
				t.stop();
			}
			if(done==5)
			{
				done=6;
				t1.stop();
				t.start();
			}
			if(x>350 & c<=430)
			{
				x=x-vel;
				repaint();
			}
			else
			{
				x=x-vel;
				c=c-vel;
				repaint();
			}
		}
		else if(x==350 & c==430 & y<290)
		{
			if(y<290)
			{
				y=y+vel;
				repaint();
			}
			if(d<230)
			{
				d=d+vel;
				repaint();
			}
		}
		//SelectA
		else if(y==290 & d==230 & x<595)
		{
			if(c==595)
			{
				x=x+vel;
				repaint();
			}
			else
			{
			x=x+vel;
			c=c+vel;
			repaint();
			}
		}
		//Add
		else if(x<625 & c<625)
		{
			x=x+vel;
			y=y-vel;
			c=c+vel;
			d=d+vel;
			repaint();
		}
		//R6in
		else
		{
			c=1200;
			d=900;
			if(y!=140 & x<750)
			{
				x=x+vel;
				repaint();
			}
			else if(x==750 & y>140)
			{
				y=y-vel;
				repaint();
			}
			else if(y==140 & x>630)
			{
				x=x-vel;
				repaint();
			}
			else
			{
				flag=5;
				repaint();
			}
		}
		}

	}
}

