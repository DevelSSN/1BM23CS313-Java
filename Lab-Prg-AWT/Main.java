import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener, MouseMotionListener
{
	String msg;
	int mouseX, mouseY;
	MyFrame()
	{
		msg="";
		mouseX=mouseY=0;
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MyWindowAdapter());
	}

	public void mouseClicked(MouseEvent e)
	{
		switch(e.getButton())
		{
			case MouseEvent.BUTTON1: msg="Left";
						 break;
			case MouseEvent.BUTTON2: msg="Scroll";
						 break;
			case MouseEvent.BUTTON3: msg="Right";
						 break;
		}
		msg+=" Button clicked";
		mouseX=e.getX();
		mouseY=e.getY();
		repaint();
	}

	public void mousePressed(MouseEvent e)
	{
		msg="Button pressed";
		mouseX=e.getX();
		mouseY=e.getY();
		repaint();
	}
	
	public void mouseReleased(MouseEvent e)
	{
		msg="Button released";
		mouseX=e.getX();
		mouseY=e.getY();
		repaint();
	}

	public void mouseDragged(MouseEvent e)
	{
		msg="Mouse Dragged:"+e.getX()+","+e.getY();
		mouseX=e.getX();
		mouseY=e.getY();
		repaint();
	}

	public void mouseMoved(MouseEvent e)
	{
		msg="Mouse Moved:"+e.getX()+","+e.getY();
		mouseX=e.getX();
		mouseY=e.getY();
		repaint();
	}

	public void mouseEntered(MouseEvent e)
	{
		msg="Mouse Entered Frame";
		mouseX=this.getWidth()/4;
		mouseY=this.getHeight()/2;
		repaint();
	}

	public void mouseExited(MouseEvent e)
	{
		msg="Mouse Exited Frame";
		mouseX=this.getWidth()/4;
		mouseY=this.getHeight()/2;
		repaint();

	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg, mouseX, mouseY);
	}

}

class MyWindowAdapter extends WindowAdapter
{
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

public class Main
{
	public static void main(String[] args)
	{
		MyFrame my = new MyFrame();
		my.setSize(new Dimension(300,400));
		my.setTitle("Mouse Demo without Adapter");
		my.setVisible(true);
	}
}

