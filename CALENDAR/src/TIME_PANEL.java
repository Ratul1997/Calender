
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TIME_PANEL extends JPanel {

    static public String[] weekName = {"SUN", "MON", "TUE", "WED", "THI", "FRI", "SAT"};

    public TIME_PANEL(int Month, int year) {
        setBackground(Color.WHITE);

        setLayout(new GridLayout(7, 7));
        setLocation(125, 180);
        setSize(350, 350);
        GridBagConstraints c = new GridBagConstraints();
        JLabel b[] = new JLabel[49];
        TIME_CLASS timeObject = new TIME_CLASS();

        int firstDay = timeObject.firstDayofnewyearMonth(timeObject.get_year());

        int daysOfMonth = timeObject.numOfDaysInMonth(Month, timeObject.isLeapYear(year));
        int currentDayofMonth = timeObject.makeEqualtoCurrentMonth(Month, year);
        int j = currentDayofMonth;
        ///System.out.println(j);
        int k = 0;

        for (int i = 0; i < 49; i++) {

            b[i] = new JLabel();
            if (i < 7) {

                b[i].setText(weekName[i]);
                b[i].setFont(new Font("Serif", Font.BOLD, 15));
                
                if(i%7==5 || i%7==6)b[i].setForeground(Color.RED);
            } else {
                if (j != 0 || (i - 7 - (currentDayofMonth - 1)) > daysOfMonth) {
                    b[i].setText(" ");
                    j--;

                    add(b[i]);
                    continue;
                }

                String s1;

                s1 = Integer.toString(i - 7 - (currentDayofMonth - 1));
                b[i].setText(s1);
                b[i].setFont(new Font("Serif", Font.BOLD, 20));
                if(i%7==5 || i%7==6)b[i].setForeground(Color.RED);
                
                
                if((i - 7 - (currentDayofMonth - 1))==timeObject.get_day())b[i].setForeground(Color.GREEN);
            }
            add(b[i]);
        }
        setOpaque(false);
    }

}
