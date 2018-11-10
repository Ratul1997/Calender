
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class YEAR_PANEL extends JPanel {

    public YEAR_PANEL(int year) {
        setBackground(Color.WHITE);
        setLocation(265, 80);
        setSize(60, 38);
        String s1;

        s1 = Integer.toString(year);
        JLabel b = new JLabel();
        
        b.setText(s1);
        b.setFont(new Font("Serif", Font.BOLD, 30));
        
        add(b);
        setOpaque(false);
    }

}
