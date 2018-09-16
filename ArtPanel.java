/**
 * HelloWorld Hackathon
 *
 * This program will generate random shapes to simuilate abstract art
 *
 * Clark Chan, chan239@purdue.edu, lc2
 *
 * 9-15-18
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ArtPanel extends JPanel {
    public void paintComponent(Graphics g){
        //super.paintComponent(g);
        int numOfShapes = (int)(Math.random()*10)+1;
        for(int x=0; x<numOfShapes; x++){
            g.setColor(new Color((int)(Math.random()*254)+1,(int)(Math.random()*254)+1,(int)(Math.random()*254)+1));
            /*switch(color){
                case 1:
                    g.setColor(Color.BLUE);
                    break;
                case 2:
                    g.setColor(Color.GREEN);
                    break;
                case 3:
                    g.setColor(Color.YELLOW);
                    break;
                case 4:
                    g.setColor(Color.RED);
                    break;
            }*/
            int shape = (int)(Math.random()*4)+1;
            switch(shape){
                case 1:
                    g.fillRect((int)(Math.random()*1000)+1,(int)(Math.random()*600)+1,(int)(Math.random()*400)+1,(int)(Math.random()*400)+1);
                    break;
                case 2:
                    g.fillOval((int)(Math.random()*1000)+1,(int)(Math.random()*600)+1,(int)(Math.random()*400)+1,(int)(Math.random()*400)+1);
                    break;
                case 3:
                    g.fillArc((int)(Math.random()*1000)+1,(int)(Math.random()*600)+1,(int)(Math.random()*400)+1,(int)(Math.random()*400)+1,(int)(Math.random()*360)+1,(int)(Math.random()*360)+1);
                    break;
                case 4:
                    int [] xPoints = new int[(int)(Math.random()*7)+3];
                    int [] yPoints = new int[xPoints.length];
                    for(int index = 0; index< xPoints.length; index++){
                        xPoints[index] =(int)(Math.random()*1000)+1;
                        yPoints[index]=(int)(Math.random()*900)+1;
                    }
                    g.fillPolygon(xPoints, yPoints, xPoints.length);
                    for(int index = 0; index< xPoints.length; index++){
                        System.out.println(xPoints[index]);
                        System.out.println(yPoints[index]);
                    }
                    break;
            }
        }
    }
}