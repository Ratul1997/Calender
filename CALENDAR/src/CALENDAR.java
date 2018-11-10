
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class CALENDAR {

    JFrame frame;
    TIME_CLASS timeObject = new TIME_CLASS();
    int year = timeObject.get_year();
    int month = timeObject.get_month();
    TIME_PANEL p = new TIME_PANEL(month, year);
    WEEK_PANEL f = new WEEK_PANEL(month);
    YEAR_PANEL y = new YEAR_PANEL(year);

    int floatMonth = month;
    int floatYear = year;

    String[] month_pic = {"1.jpg", "2.jpg", "3.jpg", "11.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg", "11.jpg", "12.jpg"};

    JButton button6;
    public void set2() {frame.getContentPane().removeAll();
        //System.out.println("ok");
        frame.getContentPane().removeAll();
        frame.setContentPane(new JLabel(new ImageIcon(getClass().getResource(month_pic[floatMonth]))));

        frame.setSize(599, 599);
        frame.setSize(600, 600);

        
        frame.remove(p);
        frame.remove(f);
        frame.remove(y);
        p = new TIME_PANEL(floatMonth, floatYear);
        f = new WEEK_PANEL(floatMonth);
        y = new YEAR_PANEL(floatYear);

        setButton();

        frame.add(new CLOCK());
        frame.add(p);
        frame.add(f);
        frame.add(y);
        frame.validate();
        frame.repaint();

    }

    void setButton() {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        JComboBox<String> c = new JComboBox<>(months);
        JPanel combo = new JPanel();
        combo.setLocation(250, 475);
        combo.setSize(100, 30);
        c.setSelectedIndex(floatMonth);
        c.setOpaque(false);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = (String) c.getSelectedItem();

                System.out.println(msg);

                switch (msg) {
                    case "January":
                        floatMonth = 0;
                        set2();
                        break;
                    case "February":
                        floatMonth = 1;
                        set2();
                        break;
                    case "March":
                        floatMonth = 2;
                        set2();
                        break;
                    case "April":
                        floatMonth = 3;
                        set2();
                        break;
                    case "May":
                        floatMonth = 4;
                        set2();
                        break;
                    case "June":
                        floatMonth = 5;
                        set2();
                        break;
                    case "July":
                        floatMonth = 6;
                        set2();
                        break;
                    case "August":
                        floatMonth = 7;
                        set2();
                        break;
                    case "September":
                        floatMonth = 8;
                        set2();
                        break;
                    case "October":
                        floatMonth = 9;
                        set2();
                        break;
                    case "December":
                        floatMonth = 11;
                        set2();
                        break;
                    case "November":
                        floatMonth = 10;
                        set2();
                        break;
                }

            }

        });
        combo.add(c);

        frame.add(combo);

        JButton button = new JButton(new ImageIcon(getClass().getResource("left3.png")));
        button.setLocation(390, 135);
        button.setSize(40, 30);

        button.setContentAreaFilled(false);
        button.setFocusable(false);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++floatMonth;

                if (floatMonth > 11) {
                    floatMonth = 0;
                    floatYear = floatYear + 1;
                }
                //System.out.println(floatMonth+" "+floatYear);
                set2();
            }
        });
        frame.add(button);

        JButton prev_button = new JButton(new ImageIcon(getClass().getResource("right3.png")));
        prev_button.setLocation(135, 135);
        prev_button.setSize(40, 30);

        prev_button.setContentAreaFilled(false);
        prev_button.setFocusable(false);
        prev_button.setBorder(BorderFactory.createEmptyBorder());
        prev_button.addActionListener(new Acb2());
        frame.add(prev_button);

        JButton next_button2 = new JButton(new ImageIcon(getClass().getResource("left3.png")));
        next_button2.setLocation(350, 90);
        next_button2.setSize(40, 30);

        next_button2.setContentAreaFilled(false);
        next_button2.setFocusable(false);
        next_button2.setBorder(BorderFactory.createEmptyBorder());
        next_button2.addActionListener(new Acb3());
        //next_button2.addActionListener(new Acb3());
        frame.add(next_button2);

        JButton prev_button2 = new JButton(new ImageIcon(getClass().getResource("right3.png")));
        prev_button2.setLocation(175, 90);
        prev_button2.setSize(40, 30);

        prev_button2.setContentAreaFilled(false);
        prev_button2.setFocusable(false);
        prev_button2.setBorder(BorderFactory.createEmptyBorder());
        prev_button2.addActionListener(new Acb4());
        frame.add(prev_button2);

        JButton button5 = new JButton(new ImageIcon(getClass().getResource("refresh.png")));
        button5.setLocation(360, 475);
        button5.setSize(50, 50);
        button5.setContentAreaFilled(false);
        button5.setFocusable(false);
        button5.setBorder(BorderFactory.createEmptyBorder());
        button5.addActionListener(new ACB5());
        
       
       frame.add(button5);
       
       
        button6 = new JButton(new ImageIcon(getClass().getResource("idea.png")));
        button6.setLocation(540, 514);
        button6.setSize(50, 50);
        button6.setContentAreaFilled(false);
        button6.setFocusable(false);
        button6.setBorder(BorderFactory.createEmptyBorder());
        button6.addActionListener(new ACB6());
        frame.add(button6);

        //c.setContentPane(months);
    }

    void SET_ALL_STRUCTURE() {

        frame = new JFrame("Calendar");
        ImageIcon i=new ImageIcon("frame.png");
        frame.setIconImage(i.getImage());
        frame.setContentPane(new JLabel(new ImageIcon(getClass().getResource(month_pic[floatMonth]))));


        frame.setLayout(null);
        frame.add(new CLOCK());
        frame.add(p);
        frame.add(f);
        frame.add(y);
        setButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException {

  
        CALENDAR test = new CALENDAR();
        test.SET_ALL_STRUCTURE();

    }

    private class ACB6 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            JFrame frame2= new JFrame("BIODATA");
            frame2.setLocation(button6.getLocation().x,(button6.getLocation().y-75));
            frame2.setContentPane(new JLabel(new ImageIcon(getClass().getResource("info.jpg"))));
            frame2.setLayout(null);
            ///frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.add(new PIC());
            frame2.setSize(450,250);
            frame2.setResizable(false);
            frame2.setVisible(true);
            
        }
    }

    private class ACB5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            floatMonth = timeObject.get_month();
            floatYear = timeObject.get_year();
            set2();
        }
    }

    private class Acb2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            --floatMonth;

            if (floatMonth < 0) {
                floatMonth = 11;
                floatYear = floatYear - 1;
            }
            //System.out.println(floatMonth+" "+floatYear);
            set2();

        }
    }

    private class Acb3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            ++floatYear;

            //System.out.println(floatMonth+" "+floatYear);
            set2();

        }
    }

    private class Acb4 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            --floatYear;

            //System.out.println(floatMonth+" "+floatYear);
            set2();

        }
    }
}
