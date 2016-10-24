import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;;

public class MovingRect extends JPanel implements ActionListener{
	Timer t = new Timer(12,this);
	int x = 0, y = 20, spdx = 2, spdy = 2;
	int flag = 1;
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.fillRect(x, y, 50, 50);
		setForeground(Color.CYAN);
		t.start();
		g.fillRect(x, y + 100, 50, 50);
		setForeground(Color.BLUE);
		t.start();
	}
	public static void main(String []args){
		MovingRect ob = new MovingRect();
		JFrame jf = new JFrame();
		jf.add(ob);
		jf.setSize(500, 500);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		if(flag == 1){
			x = x + spdx;
			repaint();
			if(x == 430)
				flag = 0;
		}
		else if(flag == 0){
			x = x - spdx;
			repaint();
			if(x == 0){
				flag = 1;
			}
		}
		
		
		// TODO Auto-generated method stub
		
	}
}
