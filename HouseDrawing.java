import java.awt.*;
import java.applet.*;
import java.awt.Color;


public class HouseDrawing extends Applet
{
public void paint (Graphics g)

{
//scenery
g.setColor (Color.white);
g.fillRect (0,0,900,500);


//Chimney
g.setColor(Color.black);
g.fillRect(34, 4, 50, 74);
g.setColor(new Color(128, 64, 0));
g.fillRect(41, 11, 38, 60);

//roof
g.setColor (Color.black);
int x [] = {0, 112, 225};
int y [] = {112, 0, 112};
g.fillPolygon (x, y, 3);

//Walls
g.setColor(Color.black);
g.fillRect(18, 112, 183, 115);
g.setColor(new Color(153, 0, 0));
g.fillRect(25, 112, 169, 108);

//Doors
g.setColor(Color.black);
g.fillRect(112, 123, 65, 97);
g.setColor(Color.gray);
g.fillRect(119, 131, 51, 88);

//Window
g
g.setColor(Color.black);
g.fillRect(40, 135, 54, 54);
g.setColor(Color.white);
g.fillRect(48, 142, 17, 17);
g.setColor(Color.white);
g.fillRect(48, 164, 17, 17);
g.setColor(Color.white);
g.fillRect(71, 142, 17, 17);
g.setColor(Color.white);
g.fillRect(71, 164, 17, 17);
}
}
