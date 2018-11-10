
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WEEK_PANEL extends JPanel {

    static public String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    public WEEK_PANEL(int x) {
        setBackground(Color.WHITE);
        setLocation(225, 125);
        setSize(150, 40);

        JLabel lb = new JLabel(months[x]);
        lb.setFont(new Font("Serif", Font.BOLD, 30));
        add(lb);
        setOpaque(false);
    }
}
