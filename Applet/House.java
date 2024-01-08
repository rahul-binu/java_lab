/*<applet code="House" width="500" height="500">
 * <parm name="myName" value="Rahul">
 * <param name="rollNo" value="33">
 * </applet>
*/

import java.applet.*;
import java.awt.*;

public class House extends Applet {
    String myName = getParameter("myName");
    String rno = getParameter("rollNo");
    int no = Integer.parseInt(rno);
    int newNo = no + 10;
    int x[] = { 100, 150, 200 };
    int y[] = { 100, 50, 100 };

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawPolygon(x, y, 3);
        g.setColor(Color.blue);
        g.drawRect(100, 100, 100, 100);
        g.drawString(myName, 100, 120);
        g.drawString(Integer.toString(newNo), 100, 130);
    }
}

