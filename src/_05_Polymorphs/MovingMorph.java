package _05_Polymorphs;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;


public class MovingMorph extends Polymorph{

	
	Random a ;
	
	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		a = new Random();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		setX(a.nextInt(600));
		setY(a.nextInt(600));
		setWidth(a.nextInt(20));
		setHeight(a.nextInt(20));
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
