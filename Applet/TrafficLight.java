import java.awt.*;
import java.applet.*;

/* <applet code="myapplet" width="500" height="300">
</applet>
*/
public class TrafficLight extends Applet {
    public void paint(Graphics g) {
        // Draw a simple traffic light
        g.setColor(Color.black);
        g.fillRect(150, 50, 200, 400);

        g.setColor(Color.red);
        g.fillOval(200, 80, 100, 100);

        g.setColor(Color.yellow);
        g.fillOval(200, 200, 100, 100);

        g.setColor(Color.green);
        g.fillOval(200, 320, 100, 100);

        g.setColor(Color.white);
        g.drawString("Traffic Light", 220, 30);
    }
}
