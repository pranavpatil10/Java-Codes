/*
<html>
   <applet code="DrawingPolygons.class"
                 width="350" height="300">

   </applet>
</html>
*/

import java.applet.*;
import java.awt.*;

public class DrawingPolygons extends Applet{
    public void paint(Graphics g){
        int x[]={70,150,190,80,100};
        int y[]={80,110,160,190,240};
        g.drawPolygon(x,y,4);

        int x1[]={210,280,330,210,230};
        int y1[]={70,110,160,190,100};
        g.fillPolygon(x1,y1,5);

        int x2[]={60,40,80};
        int y2[]={40,80,80};
        g.fillPolygon(x2,y2,3);

    }
}
