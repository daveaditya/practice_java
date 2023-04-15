// Using the Status Window.
import java.awt.*;
import java.applet.*;

/*
 * <applet code="StatusWindow" width=300 height=50>
 * </applet>
 */

public class StatusWindow extends Applet {
	public void paint(Graphics g) {
		g.drawString("This is the applet window",10,20);
		showStatus("This is shown in the status window.");
	}
}
