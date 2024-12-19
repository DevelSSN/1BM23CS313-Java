import java.awt.*;
import java.awt.event.*;

class SupMyFrame extends Frame {
	String msg;
	int mouseX, mouseY;
	SupMyFrame()
	{
		msg="";
		mouseX=mouseY=0;
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMotionAdapter(this));
		addWindowListener(new SupMyWindowAdapter());
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, mouseX, mouseY);
	}


}

class MyMouseAdapter extends MouseAdapter
{
	SupMyFrame frame;
	MyMouseAdapter(SupMyFrame frame){this.frame=frame;}
	public void mouseClicked(MouseEvent e)
	{
		switch(e.getButton())
		{
			case MouseEvent.BUTTON1: frame.msg="Left";
						 break;
			case MouseEvent.BUTTON2: frame.msg="Scroll";
						 break;
			case MouseEvent.BUTTON3: frame.msg="Right";
						 break;
		}
		frame.msg+=" Button clicked";
		frame.mouseX=e.getX();
		frame.mouseY=e.getY();
		frame.repaint();
	}

	public void mousePressed(MouseEvent e)
	{
		frame.msg="Button pressed";
		frame.mouseX=e.getX();
		frame.mouseY=e.getY();
		frame.repaint();
	}
	
	public void mouseReleased(MouseEvent e)
	{
		frame.msg="Button released";
		frame.mouseX=e.getX();
		frame.mouseY=e.getY();
		frame.repaint();
	}
/*
	public void mouseDragged(MouseEvent e)
	{
		frame.msg="Mouse Dragged:"+e.getX()+","+e.getY();
		frame.mouseX=e.getX();
		frame.mouseY=e.getY();
		frame.repaint();
	}

	public void mouseMoved(MouseEvent e)
	{
		frame.msg="Mouse Moved:"+e.getX()+","+e.getY();
		frame.mouseX=e.getX();
		frame.mouseY=e.getY();
		frame.repaint();
	}
*/
}

class MyMouseMotionAdapter extends MouseMotionAdapter
{
	SupMyFrame frame;
	MyMouseMotionAdapter(SupMyFrame frame){this.frame=frame;}

	public void mouseEntered(MouseEvent e)
	{
		frame.msg="Mouse Entered Frame";
		frame.mouseX=frame.getWidth()/2;
		frame.mouseY=frame.getHeight()/2;
		frame.repaint();
	}

	public void mouseExited(MouseEvent e)
	{
		frame.msg="Mouse Exited Frame";
		frame.mouseX=frame.getWidth()/2;
		frame.mouseY=frame.getHeight()/2;
		frame.repaint();

	}
}
	


class SupMyWindowAdapter extends WindowAdapter
{
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

public class SupMain
{
	public static void main(String[] args)
	{
		MyFrame my = new MyFrame();
		my.setSize(new Dimension(300,400));
		my.setTitle("Mouse Demo without Adapter");
		my.setVisible(true);
	}
}

