//HTML Code:=
/*
<html>
   <applet code="Applet_Demo.class"
                 height=200 width=220>

   </applet>
</html>
*/

import java.awt.*;
import java.applet.*;

public class Applet_Demo extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello Applet",10,10);
    }
}