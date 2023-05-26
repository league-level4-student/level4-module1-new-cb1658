package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    

	private int y;
    private int width;
    private int height;
    
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public int getX() {
    	return this.x;
    }
    
    public void setX(int a) {
    	this.x = a;
    }
    
    public int getY() {
    	return this.y;
    }
    
    public void setY(int a) {
    	this.y = a;
    }
    
    public int getWidth() {
    	return this.width;
    }
    
    public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
    public int getHeight() {
    	return this.height;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
