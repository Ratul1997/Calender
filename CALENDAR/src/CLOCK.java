
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Calendar;
import javax.imageio.ImageIO;

public class CLOCK extends JPanel {

    JLabel tst= new JLabel();
       
    public CLOCK() {
        setBackground(Color.WHITE);
        setLocation(225,30);
        setSize(150, 150);
        
        tst.setFont(new Font("Arial",Font.PLAIN,40));
        add(tst);
        
        Timer t= new Timer(1000,new Listener());
        t.start();
        
        setOpaque(false);

    }

    private class Listener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            
            Calendar time=Calendar.getInstance();
            int hour=time.get(Calendar.HOUR_OF_DAY);
            int min=time.get(Calendar.MINUTE);
            int sec=time.get(Calendar.SECOND);
            
            tst.setText(hour+":"+min+":"+sec);
        }
    }

}
