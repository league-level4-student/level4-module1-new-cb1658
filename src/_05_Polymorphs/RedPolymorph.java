package _05_Polymorphs;

import java.awt.Graphics;
import java.awt.Color;

public class RedPolymorph extends Polymorph{

	public RedPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
