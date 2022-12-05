import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingCanvas extends JComponent{
    private int width;
    private int height;

    public DrawingCanvas(int w, int h){
        this.height = h;
        this.width = w;
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke pen20 = new BasicStroke(5);

        g2d.setStroke(pen20);
        //body
        drawWhite(256,410,250,230,g2d);
        //right hand
        Path2D.Double rightHand = new Path2D.Double();
        rightHand.moveTo(556,320);
        rightHand.lineTo(455,360);
        rightHand.lineTo(460,370);
        rightHand.lineTo(560,330);
        rightHand.lineTo(590,350);
        rightHand.lineTo(595,345);
        rightHand.lineTo(575,330);
        rightHand.lineTo(603,330);
        rightHand.lineTo(603,320);
        rightHand.lineTo(575,320);
        rightHand.lineTo(590,300);
        rightHand.lineTo(575,300);
        rightHand.lineTo(556,320);
        g2d.setColor(Color.WHITE);
        g2d.fill(rightHand);
        g2d.setColor(Color.BLACK);
        g2d.draw(rightHand);
        drawWhite(280,290,200,180,g2d);
        drawWhite(305,180,150,140,g2d);

        //hat
        drawWhite(290,160,180,45,g2d);
        g2d.setColor(Color.WHITE);
        g2d.fillRoundRect(330,100,100,85,15,15);
        g2d.setColor(Color.BLACK);
        g2d.drawRoundRect(330,100,100,85,15,15);
        g2d.drawLine(330,150,430,150);
        //hands
        Path2D.Double leftHand = new Path2D.Double();
        leftHand.moveTo(195,320);//1
        leftHand.lineTo(305,360);//2
        leftHand.lineTo(300,370);//3
        leftHand.lineTo(190,330);//4
        leftHand.lineTo(160,350);//5
        leftHand.lineTo(155,345);//6
        leftHand.lineTo(175,330);//7
        leftHand.lineTo(147,330);//8
        leftHand.lineTo(147,320);//9
        leftHand.lineTo(175,320);//10
        leftHand.lineTo(160,300);//11
        leftHand.lineTo(175,300);//12
        leftHand.lineTo(195,320);//13
        g2d.setColor(Color.WHITE);
        g2d.fill(leftHand);
        g2d.setColor(Color.BLACK);
        g2d.draw(leftHand);


        //buttons
        BasicStroke pen = new BasicStroke(2);
        g2d.setStroke(pen);
        g2d.setColor(Color.BLACK);
        // eyes
        g2d.drawOval(408,230,14,14);
        g2d.drawOval(368,230,14,14);

        // nose
        Path2D.Double nose = new Path2D.Double();
        nose.moveTo(393,270);//1
        nose.lineTo(480,250);//2
        nose.lineTo(390,250);//3
        nose.lineTo(393,270);//
        g2d.setColor(Color.WHITE);
        g2d.fill(nose);
        g2d.setColor(Color.BLACK);
        g2d.draw(nose);

        //smile
        g2d.drawOval(355,275,12,12);
        g2d.drawOval(374,285,12,12);
        g2d.drawOval(396,285,12,12);
        g2d.drawOval(415,275,12,12);

        // buttons
        g2d.drawOval(400,360,10,10);
        g2d.drawOval(400,385,10,10);
        g2d.drawOval(400,410,10,10);

    }

    public void drawWhite(int x, int y,int w,int h,Graphics2D g2d){
        g2d.setColor(Color.WHITE);
        g2d.fillOval(x, y, w,h);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(x, y, w,h);
    }
}

