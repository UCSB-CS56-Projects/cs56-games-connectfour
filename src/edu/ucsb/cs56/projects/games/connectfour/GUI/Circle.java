package edu.ucsb.cs56.projects.games.connectfour.GUI;

import java.awt.*;

/**
 * Circle draws a circle at the specified location and with
 * the specified color.
 *
 * @author Jake Dumont
 * @author Heneli Kailahi
 * @version CS56, Spring 2013, UCSB
 */
public class Circle {

    private int x;
    private int y;
    private int width;
    private int height;
    private int state = 0;

    /**
     * Constructor for objects of class Circle
     *
     * @param x x coordinate of upper left hand corner of circle
     * @param y y coordinate of upper left hand corner of circle
     * @param w width of circle
     * @param h height of circle
     */

    public Circle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y + 20;
        this.width = w;
        this.height = h;
        this.state = 0;

    }

    /**
     * Method that returns a small copy of the circle that calls the method
     *
     * @return Circle obj reference that is half as large, in same location
     */
    public Circle smallCopy() {
        Circle w = new Circle(this.x, this.y-20, this.width / 2, this.height / 2);
        return w;
    }


    /**
     * @param value the int that the state variable is set to
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * Getter for the state variable
     *
     * @return int
     */
    public int getState() {
        return this.state;
    }

    /**
     * Draw function for the circle. Color depends on the state.
     *
     * @param g graphics
     */
    public void draw(Graphics g) {

        if (state == 0) {
            g.setColor(Color.white);
        } else if (state == 1) {
            g.setColor(Color.red);
        } else if (state == 2) {
            g.setColor(Color.yellow);
        }

        //RESERVED FOR WINNING CIRCLES
        else if (state == 3) {
            g.setColor(Color.GREEN);
        } else if (state == 4) {
            g.setColor(Color.black);
        } else if (state == 5) {
            g.setColor(Color.blue);
        } else if (state == 6) {
            g.setColor(Color.magenta);
        } else if (state == 7) {
            g.setColor(Color.orange.darker());
        } else if (state == 8) {
            g.setColor(Color.pink);
        } else { // failsafe
            g.setColor(Color.darkGray);
        }

        g.drawOval(x - width / 2, y - height / 2, width, height);
        g.fillOval(x - width / 2, y - height / 2, width, height);
    }
}
