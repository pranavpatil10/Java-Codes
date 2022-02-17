/*
<html>
  <applet code="Graphics_Demo.class"
   height=200 width=320>
  </applet>
</html>
*/

import java.applet.*;
import java.awt.*;

public class Graphics_Demo extends Applet{
    public void paint(Graphics g){
        g.drawLine(20,20,60,60);
        g.drawRect(80,20,40,30);
        g.fillRect(160,10,30,80);
        g.drawRoundRect(100,100,80,50,30,30);
        g.fillRoundRect(100,200,80,50,30,30);

        
    }
}