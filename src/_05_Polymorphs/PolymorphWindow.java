package _05_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * 1. Create new member variables for the width and height of Polymorph then 
 * initialize them in its constructor. DONE
 * 
 * 2. Encapsulate the member variables of the Polymorph class. DONE 
 * 
 * 3. Substitute the hard-coded numbers in the draw method of the BluePolymorph 
 * class with its width and height. DONE
 * 
 * 4. Create a new sub-class of the Polymorph class called RedPolymorph. DONE
 * 
 * 5. Make RedPolymorph draw a red rectangle when its draw method is called. DONE
 * 
 * 6. Create an object of RedPolymorph in the PolymorphWindow class and test
 * it by drawing it like the BluePolymorph. DONE
 * 
 * 7. Create a new sub-class of the Polymorph class called MovingMorph. DONE
 * 
 * 8. Add code to its update method to make MovingMorph objects move around
 * the screen. DONE
 * 
 * 9. Create a MovingMorph object in your PolymorphWindow class and test it
 * by calling its draw and update methods.DONE
 * 
 * 10. Now, delete all references to Polymorphs subclasses inside your
 * PolymorphWindow class. DONE
 * 
 * 11. Create an ArrayList of Polymorph inside your PolymorphWindow class. DONE
 * 
 * 12. Initialize the ArrayList and add a bunch of different types of
 * Polymorph subclass objects to the ArrayList. DONE
 * 
 * 13. Use loops to call the draw and update method for all the Polymorphs in 
 * the list.
 * 
 */

public class PolymorphWindow extends JPanel implements ActionListener {

    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;

    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> morphs = new ArrayList<Polymorph>();
    

//    Polymorph bluePoly;
//    Polymorph redPoly;
//    Polymorph movingPoly;

    public static void main(String[] args) {
        new PolymorphWindow().buildWindow();
    }

    public void buildWindow() {
        window = new JFrame("IT'S MORPHIN' TIME!");
        window.add(this);
        window.getContentPane().setPreferredSize(new Dimension(500, 500));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);

//        bluePoly = new BluePolymorph(50, 50,40,40);
//        redPoly = new RedPolymorph(40,30,20,10);
//        movingPoly = new MovingMorph(0,0,0,0);
        
        morphs.add(new RedPolymorph(150,200,50,50));
        morphs.add(new MovingMorph(1,1,1,1));
        morphs.add(new MovingMorph(1,1,2,2));
        morphs.add(new MovingMorph(1,1,3,3));
        morphs.add(new MovingMorph(1,1,4,4));
        morphs.add(new MovingMorph(1,1,5,5));
        morphs.add(new MovingMorph(1,1,6,6));
        
        morphs.add(new MovingMorph(1,1,7,7));
        morphs.add(new MovingMorph(1,1,8,8));
        morphs.add(new MovingMorph(1,1,9,9));
        morphs.add(new MovingMorph(1,1,10,10));
        

        timer = new Timer(1000 / 30, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        // draw background
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 500, 500);

        // draw polymorph
//        bluePoly.draw(g);
//        redPoly.draw(g);
//        
//        for(int i = 0; i < 5; i++) {
//        	movingPoly.update();
//        	movingPoly.draw(g);
//        }
        
        for(int i = 0; i < morphs.size(); i++) {
        	morphs.get(i).update();
        	morphs.get(i).draw(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
//        bluePoly.update();

    }
}
